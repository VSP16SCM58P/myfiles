import React, { Component } from 'react';
import userpage from './userpage';
class Projects extends React.Component {

  constructor(props) {
    super(props);
    this.state = {username: '',password:''}

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }
  handleChange(event) {
    this.setState({username: event.target.value});
    this.setState({password: event.target.value});
  }
  handleSubmit(event) {
    //alert('A name and password was submitted: ' + this.state.value+this.state.password);
    this.setState({txt:event.target.vaue})
//  <script type="text/javascript" src="userpage.js" />
//<a href='/use' onSubmit={this.UserName.bind(this)}></a>
//if(value==='vikas' && password==='prathap')
//{
  //<div><userpage/></div>
//}
    event.preventDefault();
  }
  render() {
    return (
      <form onSubmit={this.handleSubmit} class="userpage">
        <label>
          UserName:
          <input type="text" value={this.state.username} onChange={this.handleChange} />
        </label>
        <label>
          PassWord:
          <input type="password" password={this.state.password} onChange={this.handleChange} />
        </label>
        <input type="submit" value="Submit"  onSubmit="welcome"/>
      </form>
      //<div><username</div>
    );
  }
}

export default Projects;
