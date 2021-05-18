let indianClock=document.getElementById('indianClock');
let dubaiClock=document.getElementById('dubaiClock');
let usClock=document.getElementById('usClock');

/*
 *  1. add text
 *  2. edit
 *  3. delete text 
 *  same  node
 * 
 * 
 * */

function jsClock(props){
    let time=new Date().toLocaleTimeString('en-US',{timeZone:props});
    
    let ui=`
    <div>
            <span> ${props} </span>
            <p> ${time} </p>
    </div>
    
    `
   return ui;
}

setInterval(()=>{
    indianClock.innerHTML=jsClock('Asia/Kolkata');
    dubaiClock.innerHTML=jsClock('Asia/Dubai');
    usClock.innerHTML=jsClock('America/New_York');
},1000)

