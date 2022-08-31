import React from "react";
import "./css/popup.css";

const Popup = (props) => {
  return (
    <div id="background-box">
      <div id="content-box">
        <div id="cancel-icon" onClick={props.handleClose}>
          <span id="cross" role="img" aria-label="close">
            ❌
          </span>
        </div>
        <div id="popup-content">{props.content}</div>
      </div>
    </div>
  );
};

export default Popup;
