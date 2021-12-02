package com.Raquel;

import java.util.ArrayList;
import java.util.List;
import io.javalin.Javalin;

public class MenuDriver {
	// Collection list
	public static List<Collection> orders;

	public static void main(String[] args) {

		// initializing the menu array
		orders = new ArrayList<Collection>();

		Javalin app = Javalin.create();

		app.start(7778);

		app.post("/order", ctx -> {
			// our information is going to be coming in as "form parameters"
			Collection ba = new Collection();
			ba.MenuName = ctx.formParam("MenuName");
			ba.MenuPrice = Integer.parseInt(ctx.formParam("MenuPrice"));
			ba.address = ctx.formParam("address");
			ba.order = ctx.formParam("order");

			orders.add(ba);

			String responseText = "";

			for (Collection eachMenu : orders) {

				if (eachMenu != null) {
					responseText += eachMenu.order + "<br>" + eachMenu.MenuName + " " + eachMenu.MenuPrice + "<br>"
							+ eachMenu.address + "<br>";

				}
			}
			ctx.html(responseText);
		});
	}

}
