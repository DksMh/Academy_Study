package Address;

import java.util.ArrayList;

import Address_contoller.AddressController;
import Address_model.AddressVo;
import Address_view.AddressByName;
import Address_view.AddressDelete;
import Address_view.AddressDetail;
import Address_view.AddressEdit;
import Address_view.AddressListView;
import Address_view.AddressView;
import Address_view.InsertView;
import Address_view.MenuView;

public class R {
	public static int no;
//	public static AddressVo[] AddressArr;
	public static AddressVo addressVo;
	public static ArrayList<AddressVo> adrlist;

	public static final AddressView menuView = new MenuView();

	public static final AddressView insertView = new InsertView();
	public static final AddressView AddressByName = new AddressByName();
	public static final AddressView AddressDelete = new AddressDelete();
	public static final AddressView AddressDetail = new AddressDetail();
	public static final AddressView AddressEdit = new AddressEdit();
	public static final AddressView AddressListView = new AddressListView();

	public static final AddressController AddressController = new AddressController();
}
