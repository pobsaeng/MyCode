import React, {Component} from 'react'
import { render } from 'react-dom'
import 'bootstrap/dist/css/bootstrap.css';

class SearchBox extends Component {
  constructor(props){
    super(props);
  }

  render() {
    return (
      <div>
      <div className="container">
	<div className="row">
		<div className="col-md-12">
            <div className="input-group" id="adv-search">
                <input type="text" className="form-control" placeholder="Search for snippets" />
                <div className="input-group-btn">
                    <div className="btn-group" role="group">
                        <button type="button" className="btn btn-primary"><span className="glyphicon glyphicon-search" aria-hidden="true"></span>
                        </button>
                    </div>
                </div>
            </div>
          </div>
        </div>
	</div>
</div>
    );
  }
}
export default SearchBox;