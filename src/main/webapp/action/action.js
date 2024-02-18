let login_btn = document.getElementById("login-btn");
let apply_btn = document.getElementById("apply-btn");
let login_form = document.getElementById("login-div");
let apply_form = document.getElementById("apply-div");
let close_btn = document.querySelector(".close-login-btn");
let form_submit = document.querySelector(".login-submit-btn");

login_btn.addEventListener("click", () => {
  login_form.style.visibility = "visible";
  apply_form.style.visibility = "hidden";
});
apply_btn.addEventListener("click", () => {
  apply_form.style.visibility = "visible";
  login_form.style.visibility = "hidden";
});
close_btn.addEventListener("click", () => {
  login_form.style.visibility = "hidden";
});

let edit_employee = document.querySelector(".edit-employee-btn");
let delete_employee = document.querySelector(".delete-employee-btn");

edit_employee.addEventListener("click", () => {
	console.log("clicked")
})
