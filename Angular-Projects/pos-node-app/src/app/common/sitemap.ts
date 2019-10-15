export function siteMap() {
    let URL = "http://192.168.1.13:8000";
    return {
        login: {
            "LOGIN_URL": URL + "/api/signin"
        },
        cateogires: {
            "Attribute1": "value4",
            "Attribute2": "value5",
            "Attribute3": "value6"
        },
        groupproduct: {
            "CRETAE_URL": URL + "/api/groupProduct/insert",
            "SEARCH_LIKE_URL": URL + "/api/groupProduct/searchLike"
        },
        product: {
            "PRODUCT_URL": URL + "/api/product"
        }
    };
}
