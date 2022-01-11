// import logo from './logo.svg';
import six from './Six-Thinking-Hats.jpg';
import './App.css';
import { useState } from 'react';

function App() {

  let posts = '모자 기법🎩';
  let redhat = {fontWeight: 'bold'};
  let [모자, 모자변경] = useState(['빨간','노랑','파랑','초록','하양','검정'])
  let [하트, 하트변경] = useState(0);

  function 함수(){
    return 6
  }

  // function 모자고르기(){

  // }

  function heart(){
    {하트변경(하트+1)}
  }

  return (
    <div className='App'>
      <div className='black-nav'>
        <div>Beyond Meeting</div>
      </div>
      <div>
        <br></br>
      </div>
      <img src={six} style= {{  height: "22vh", width: "25vw",}} />
      <h1> {함수()} {posts} </h1>

      {/* 리엑트(JSX)를 쓰는 이유  : 데이터 바인딩이 쉬워진다. {변수명,함수,이미지} */}
      {/* 인라인 스타일 style={{:,:,:}} */}

{/* 중요한 데이터는 state에 !1 */}

      <div style= {{padding:'0px 600px',margin:'auto', fontWeight: 'bold'}} >
        <div style={{padding:'10px',background:'darkgray'}}>
          <h3 style={{color:'red'}}> {모자[0]}모자 
            <span onClick={ heart }> ❤ </span> {하트}
          </h3>
          <h3 style={{color:'yellow'}}>  {모자[1]}모자  
            <span onClick={ heart }> ❤ </span> {하트}
          </h3>
          <h3 style={{color:'blue'}}>  {모자[2]}모자  
            <span onClick={ heart }> ❤ </span> {하트}
          </h3>
          <h3 style={{color:'green'}}>  {모자[3]}모자  
            <span onClick={ heart }> ❤ </span> {하트}
          </h3>
          <h3 style={{color:'white'}}>  {모자[4]}모자  
            <span onClick={ heart }> ❤ </span> {하트}
          </h3>
          <h3 style={{color:'black'}}>  {모자[5]}모자  
            <span onClick={ heart }> ❤ </span> {하트}
          </h3>
        </div>
      </div> 

    <br></br>
      <button style= {{fontWeight: 'bold', color : 'purple',}}> 로그인</button> 
    
    {/* <button onClick={ 모자고르기 }> 모자고르기</button> */}
       

    </div>

    // useState 에 데이터 저장해 놓는 이유 : state는 변경되면 HTML이 자동으로 재렌더링 됨! 새로고침 없어도 재렌더링!!
  );
}

export default App;
