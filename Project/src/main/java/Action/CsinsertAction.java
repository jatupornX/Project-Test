package Action;

import java.io.IOException;

import com.opensymphony.xwork2.ActionSupport;

public class CsinsertAction extends ActionSupport{
	
	public CustomerModel cusModel ;
	
	public String insertCustomer() throws IOException, Exception {
		try {
			TbCustomerData cusData = new TbCustomerData();
			cusData.insertCustomer(cusModel);
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
		
		return SUCCESS;
	}
	
	
	
	
	public CustomerModel getCusModel() {
		return cusModel;
	}

	public void setCusModel(CustomerModel cusModel) {
		this.cusModel = cusModel;
	}
	
	
}
