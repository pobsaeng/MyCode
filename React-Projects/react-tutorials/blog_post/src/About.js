import React, {Component} from 'react';

class About extends Component {

  constructor(props){
    super(props);
    this.state = {
      zipcode: '',
      cityName: '',
      desc: '',
      currTemp: '',
      hiTemp: '',
      loTemp: ''
    }
  }

  sanitizeInput(str){

  }

  handleChange(e){
    let z = e.target.value;
    this.setState({zipcode: z});
  }

  getWeather(){
    let base = this;
    fetch(`http://api.openweathermap.org/data/2.5/weather?zip=${base.state.zipcode},us&units=imperial&appid=052f26926ae9784c2d677ca7bc5dec98`)
      .then((response) => {
        return response.json();
      }).then((json) => {
        console.log(json);
        base.setState({cityName: json.name,
          desc: json.weather[0].description,
          currTemp: `${json.main.temp} \u{2109}`,
          hiTemp: `${json.main.temp_max} \u{2109}`,
          loTemp: `${json.main.temp_min} \u{2109}`,
        });
      })
      .catch((ex) => {
        console.log("error", ex);
      });
  }

  formSubmit(e){
    this.getWeather();
    e.preventDefault();
  }


  render(){
    return(
      <div>
        <h1>Get the weather!</h1>
        <form onSubmit={(e) => {this.formSubmit(e)}}>
          <label>Zipcode:
            <input type="text" name="zipcode" onChange={(e) => {this.handleChange(e)}}></input>
          </label>
          <input type="submit" value="Get weather"></input>
        </form>
        <div>
          <h2>{this.state.cityName}</h2>
          <p>{this.state.desc}</p>
          <h1>{this.state.currTemp}</h1>
          <div>
            <span className="">{this.state.hiTemp}&emsp;&emsp;&emsp;</span>
            <span className="">{this.state.loTemp}</span>
          </div>
        </div>
      </div>
    )
  }
}

export default About;
