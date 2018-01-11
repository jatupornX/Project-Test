package com.smartict.testaction;

public class Show_model {

	
		// TODO Auto-generated method stub


			private String name,email;
	

			public String getUsername() {
				return name;
			}

			public void setUsername(String username) {
				this.name = username;
			}

			// all struts logic here
			public String execute() {

				return "SUCCESS";

			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}
		
	}


