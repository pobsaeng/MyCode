import React from "react";
import $ from "jquery";
import { render } from "react-dom";
import ReactTable from "react-table";
import "react-table/react-table.css";
// import Helper from '../util/Helper';

export default class Gallery extends React.Component {
  constructor(props) {
    super(props);

    let me = this;

    me.state = {
      data: [],
      cusotmer: [],
      startPage: 5,
      pageSize: 10
    };

    // Helper.ajaxLoader("GET", "https://jsonplaceholder.typicode.com/comments", null, function (result) {
    //   let jsonData = JSON.parse(result);
    //   me.setState({ data: jsonData });
    // });

    this.getJSonToState();
  }

  componentDidMount() { }

  getJSonToState() {

    let me = this;
    $.ajax({
      url: "https://jsonplaceholder.typicode.com/comments"
    }).then(function (data) {
      me.setState({ data: data });
    });
  }
  onRowClick = (state, rowInfo, column, instance) => {
    return {
      onClick: e => {
        // console.log('A Td Element was clicked!')
        // console.log('it produced this event:', e)
        // console.log('It was in this column:', column)
        // console.log('It was in this row:', rowInfo.original)
        // console.log('It was in this table instance:', instance)
        alert(rowInfo.original.id+', '+rowInfo.original.email)
      }
    }
  }
  getColumn() {
    return [
      {
        Header: "ID",
        width: 100,
        accessor: "id"
      },
      {
        Header: "Name",
        width: 400,
        accessor: "name"
      },
      {
        Header: "Email",
        width: 350,
        accessor: "email"
      },
      {
        Header: "Body",
        accessor: "body"
      }
    ];
  }
  render() {
    const { data, startPage, pageSize } = this.state;
    const columns = this.getColumn();

    return (
      <div className="table">
        <ReactTable
          data={data}
          columns={columns} getTrProps={this.onRowClick}
          //filterable
          //page={startPage}
          defaultPageSize={pageSize}
          className="-striped -highlight"
        />
      </div>
    );
  }
}
