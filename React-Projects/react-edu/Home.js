class Home{
    constructor(){

    }
    init(data){
        let btnClick = document.getElementById('btnClick');
        console.log( data);
        // btnClick.addEventListener('click', function(){
        //     alert('Hello');
        // });
    }
}
module.exports = new Home();