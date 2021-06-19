printjson(db.people.insertOne({
	"sex" : "Male",
        "first_name" : "Adam",
        "last_name" : "Suchodolski",
        "job" : "Developer",
        "email" : "s15188@pjatk.edu.pl",
        "location" : {
                "city" : "Warsaw",
                "address" : {
                        "streetname" : "Beilfuss",
                        "streetnumber" : "860"
                }
        },
        "description" : "vulputate justo in blandit ultrices enim lorem ipsum dolor sit amet consectetuer adipiscing elit proin interdum mauris",
        "height" : "184.4",
        "weight" : "60.81",
        "birth_date" : "1997-12-20T02:55:03Z",
        "nationality" : "Poland",
        "credit" : 
		[{
                        "type" : "switch",
                        "number" : "6759888939100098691",
                        "currency" : "COP",
                        "balance" : "1017.06"
                }]
}))