import logo from './logo.svg';
import './App.css';
import ConnectionComponent from './components/ConnectionComponent';

function App() {
  return (
    <div>
      <ConnectionComponent/>
    </div>  
  );//this is a jsx=js xml like code which is just an extension of js language syntax
  //header and footer are applicable to all the components so we can keep header and fotter outsite Switch
  //exact means rederictering to the exact route
}

export default App;
