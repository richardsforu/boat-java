function test(e){
    console.log('clicked ...');
    console.log(e);
    if(e.id==='b1'){
       f1();
    }

    if(e.id==='b2'){
        f2();
     }

     if(e.id==='b3'){
        f3();
     }
}


function f1(){
    alert('f1')
}

function f2(){
    alert('f2')
}

function f3(){
    alert('f3')
}