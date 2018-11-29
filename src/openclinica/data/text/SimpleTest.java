package openclinica.data.text;

public class SimpleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rawMappingStr= "StudyOID=S_MY_2NDST(PROD)\r\n"+
				"StudyEventOID=SE_SCREENVISIT\r\n" + 
				"FormOID=F_VITALSIGN\r\n" + 
				"FormVersion=1.2\r\n" + 
				"#list all item group OID\r\n" + 				
				"Height=IG_VITAL_GROUP1.HeightOID\r\n" + 
				"Height Units=IG_VITAL_GROUP1.HeightUnitsOID\r\n" + 
				"Weight=IG_VITAL_GROUP2.WeightOID\r\n" + 
				"Weight Units=IG_VITAL_GROUP2.WeightUnitsOID";
		String rawItemData=
				"AAA|ParticipantID|Height|Height Units|Weight |Weight Units|Enrollment Date|Age|Ethnicity|Race|Repeatingkey|startDate|endDate\r\n" + 
				"|WAL-004|64|in|201|lbs|2018-09-02|76|Hispanic or Latino|Caucasia|1|||\r\n" + 
				"|WAL-004|63|in|200|lbs|2018-10-02|77|Hispanic or Latino|Caucasia|2||\r\n" + 
				"|WAL-005|154|cm|89|kg|2018-10-02|63|Non-hispanic or latino|African American|||\r\n" + 
				"|WAL-006|54|in|141|lbs|2018-10-12|54|Non-hispanic or latino|Caucasian|||\r\n" + 
				"";

		TextToODMHelper helper= new TextToODMHelper();
		
		helper.transformTextToODMxml(rawMappingStr, rawItemData);
	}

}
