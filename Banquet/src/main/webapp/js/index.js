/**
 * 遮罩二维码
 */
document.addEventListener('DOMContentLoaded', function () {
    const mask = document.getElementById('mask');
    const maskQRCodeClose = document.getElementById('mask-qrcode-close');
    const maskQrCode = document.getElementById('mask-qrcode');
    const maskQrCodeTip = document.getElementById('mask-qrcode-tip');
    const socialLinks = document.querySelectorAll('.footer-social a[href^="#"], .footer-social a[href^="javascript"], .footer-social a[href=""]');
    socialLinks.forEach(link => {
        link.addEventListener('click', function (event) {
            event.preventDefault();
            toggleMask(this);
        });
    });

    function toggleMask(link) {
        if (mask.classList.contains('display-none')) {
            mask.classList.remove('display-none');
            mask.classList.add('display-block');
            document.body.style.overflow = 'hidden';
            // 如果有 data-src 属性, 设置图片 src
            if (link && link.hasAttribute('data-src')) {
                maskQrCode.src = `${link.getAttribute('data-src')}`;
                maskQrCode.classList.remove('mask-qrcode-logout');
                maskQrCodeTip.innerText = link.getAttribute('title');
            } else {
                // 否则添加 mask-qrcode-logout 类
                maskQrCode.src = '';
                maskQrCode.classList.add('mask-qrcode-logout');
                maskQrCodeTip.innerText = '账号未注册或已注销';
            }
        } else {
            mask.classList.remove('display-block');
            mask.classList.add('display-none');
            document.body.style.overflow = '';
        }
    }

    maskQRCodeClose.addEventListener('click', toggleMask)
});


/**
 * 语言选择
 */
document.addEventListener('DOMContentLoaded', function () {
    const languageContainer = document.querySelector('.language');
    const languageSlide = document.querySelector('.language-slide');
    const languageTitle = document.querySelector('.language-title');
    const languageGridItems = document.querySelectorAll('.language-grid-item');

    // 添加事件监听器
    languageContainer.addEventListener('click', toggleLanguageSlide);
    languageGridItems.forEach(item => item.addEventListener('click', selectLanguageItem));

    // 切换语言选择器的显示/隐藏
    function toggleLanguageSlide() {
        if (languageContainer.classList.contains('selected') || languageSlide.classList.contains('display-block')) {
            languageContainer.classList.remove('selected')
            languageSlide.classList.remove('display-block');
            languageSlide.classList.add('display-none');
        } else {
            languageContainer.classList.add('selected')
            languageSlide.classList.remove('display-none');
            languageSlide.classList.add('display-block');
        }

        // 监听响应页面其他区域的点击
        document.addEventListener('click', handleOutsideClick);
    }

    // 页面其他区域的点击
    function handleOutsideClick(event) {
        // 点击 .language-slide 或者 .language 之外
        if (!languageSlide.contains(event.target) && !languageContainer.contains(event.target)) {
            languageContainer.classList.remove('selected');
            languageSlide.classList.remove('display-block');
            languageSlide.classList.add('display-none');
        }

        // 移除事件监听器, 避免多次添加
        // document.removeEventListener('click', handleOutsideClick);
    }

    // 选择语言项
    function selectLanguageItem(event) {
        // 更新语言标题
        languageTitle.textContent = event.currentTarget.querySelector('.language-content').textContent;
        // 清除所有语言项的选中状态
        languageGridItems.forEach(item => item.classList.remove('selected'));
        // 设置当前点击的语言项为选中状态
        event.currentTarget.classList.add('selected');
        // 隐藏语言选择器
        toggleLanguageSlide();
        if (event.currentTarget && event.currentTarget.hasAttribute("data-language")) {
            // 存储用户的选择到 localStorage
            const selectedLanguage = event.currentTarget.getAttribute('data-language');
            localStorage.setItem('selectedLanguage', selectedLanguage);
            const currentPath = window.location.pathname;
            window.location.href = `/${selectedLanguage}/?returnUrl=${currentPath}`;
        }
    }

    // 初始化状态, 默认隐藏语言选择器
    // toggleLanguageSlide();

    // 获取浏览器默认语言并设置默认选中的语言项
    function setPreferredLanguage() {
        // 从 localStorage 获取用户之前的选择
        const selectedLanguage = localStorage.getItem('selectedLanguage');
        let preferredLanguageParts;

        if (selectedLanguage) {
            preferredLanguageParts = [selectedLanguage.toLowerCase()];
        } else {
            // 获取浏览器默认语言
            const preferredLocale = window.navigator.language || window.navigator.userLanguage;
            // 分割首选语言
            preferredLanguageParts = preferredLocale.split('-').map(part => part.toLowerCase());
        }

        // 找到对应的 .language-grid-item
        const matchingLanguageItem = Array.from(languageGridItems).find(item => {
            return preferredLanguageParts.includes(item.getAttribute('data-language').toLowerCase());
        });

        if (matchingLanguageItem) {
            // 设置为选中状态
            matchingLanguageItem.classList.add('selected');
            // 更新语言标题
            languageTitle.textContent = matchingLanguageItem.querySelector('.language-content').textContent;
        }
    }

    // 设置默认选中的语言项
    setPreferredLanguage();
});


/**
 * 用户信息
 */
document.addEventListener('DOMContentLoaded', function () {
    const userLoginElement = document.querySelector('.user-login');
    const headerUserMoreElement = document.querySelector('.header-user-more');

    // 切换 header-user-more 显示与隐藏
    userLoginElement.addEventListener('click', function (event) {
        event.stopPropagation();
        if (this.href !== 'javascript: void(0);') {
            window.location.href = this.href
        } else {
            // headerUserMoreElement.style.display = headerUserMoreElement.style.display === 'none' ? 'block' : 'none';
            // headerUserMoreElement.classList[headerUserMoreElement.classList.contains('display-block') ? 'add' : 'remove']('display-none');
            if (headerUserMoreElement.classList.contains('display-none')) {
                headerUserMoreElement.classList.remove('display-none');
                headerUserMoreElement.classList.add('display-block');
            } else {
                headerUserMoreElement.classList.remove('display-block');
                headerUserMoreElement.classList.add('display-none');
            }
        }
    });

    // 当点击页面其他区域时隐藏 header-user-more
    document.addEventListener('click', function (event) {
        if (headerUserMoreElement) {
            if (!userLoginElement.contains(event.target) && !headerUserMoreElement.contains(event.target)) {
                headerUserMoreElement.classList.remove('display-block');
                headerUserMoreElement.classList.add('display-none');
            }
        }
    });
});


/**
 * header 定位
 */
document.addEventListener('DOMContentLoaded', function () {
    const header = document.getElementById('header');

    function debounce(func, wait) {
        let timeout;
        return function () {
            clearTimeout(timeout);
            timeout = setTimeout(() => func.apply(this, arguments), wait);
        };
    }

    const handleScroll = debounce(function () {
        if (window.scrollY >= 100) {
            header.classList.remove('position-absolute');
            header.classList.add('position-fixed');
        } else {
            header.classList.remove('position-fixed');
            header.classList.add('position-absolute');
        }
    }, 100);

    window.addEventListener('scroll', handleScroll);
});


window.onload = () => {
}
