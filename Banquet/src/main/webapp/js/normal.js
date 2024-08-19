/**
 * 外链
 */
document.addEventListener('DOMContentLoaded', function () {
    const links = document.querySelectorAll('a[target="_blank"]');
    links.forEach(link => {
        link.classList.add('external-link');
    });
});


/**
 * 隐藏显示的 block
 */
document.addEventListener('DOMContentLoaded', function () {
    function isInViewport(element) {
        const rect = element.getBoundingClientRect();
        return (
            rect.top < 0 ||
            rect.left < 0 ||
            rect.bottom > (window.innerHeight || document.documentElement.clientHeight) ||
            rect.right > (window.innerWidth || document.documentElement.clientWidth)
        );
    }

    function handleScroll() {
        const elements = document.querySelectorAll('.display-block');
        elements.forEach((element) => {
            if (isInViewport(element)) {
                element.classList.remove('display-block');
                element.classList.add('display-none');
            }
        });
    }

    window.addEventListener('scroll', handleScroll);

    handleScroll();
});


/**
 * scroll-nav
 */
document.addEventListener('DOMContentLoaded', function () {
    const scrollNav = document.getElementById('scroll-nav');
    const scrollRefreshButton = document.getElementById('refresh');
    const scrollMoreButton = document.getElementById('more');
    const scrollToTopButton = document.getElementById('to-top');

    function updateScrollNavVisibility() {
        if (window.scrollY >= 300) {
            scrollNav.classList.remove('display-none');
            scrollNav.classList.add('display-block');
        } else {
            scrollNav.classList.remove('display-block');
            scrollNav.classList.add('display-none');
        }
    }

    updateScrollNavVisibility();
    
    window.addEventListener('scroll', function () {
        updateScrollNavVisibility();
    });

    scrollRefreshButton.addEventListener('click', function (event) {
        event.preventDefault();
        window.location.reload();
    });

    scrollToTopButton.addEventListener('click', function (event) {
        event.preventDefault();
        window.scrollTo({
            top: 0,
            behavior: 'smooth'
        });
    });
});


window.onload = () => {
}