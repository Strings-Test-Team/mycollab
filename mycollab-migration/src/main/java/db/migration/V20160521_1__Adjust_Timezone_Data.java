package db.migration;

import org.flywaydb.core.api.migration.spring.SpringJdbcMigration;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedHashMap;

/**
 * @author MyCollab Ltd
 * @since 5.3.2
 */
public class V20160521_1__Adjust_Timezone_Data implements SpringJdbcMigration {
    @Override
    public void migrate(JdbcTemplate jdbcTemplate) throws Exception {
        final LinkedHashMap<String, String> timeMap = new LinkedHashMap<>();

        timeMap.put("3", "Pacific/Midway");
        timeMap.put("4", "Pacific/Niue");
        timeMap.put("5", "Pacific/Pago_Pago");
        timeMap.put("6", "Pacific/Samoa");
        timeMap.put("8", "America/Adak");
        timeMap.put("9", "America/Atka");
        timeMap.put("12", "Pacific/Fakaofo");
        timeMap.put("13", "Pacific/Honolulu");
        timeMap.put("14", "Pacific/Johnston");
        timeMap.put("15", "Pacific/Rarotonga");
        timeMap.put("16", "Pacific/Tahiti");
        timeMap.put("20", "Pacific/Marquesas");
        timeMap.put("22", "America/Anchorage");
        timeMap.put("23", "America/Juneau");
        timeMap.put("24", "America/Nome");
        timeMap.put("25", "America/Sitka");
        timeMap.put("26", "America/Yakutat");
        timeMap.put("28", "Pacific/Gambier");
        timeMap.put("32", "America/Dawson");
        timeMap.put("33", "America/Ensenada");
        timeMap.put("34", "America/Los_Angeles");
        timeMap.put("35", "America/Metlakatla");
        timeMap.put("36", "America/Santa_Isabel");
        timeMap.put("37", "America/Tijuana");
        timeMap.put("38", "America/Vancouver");
        timeMap.put("39", "America/Whitehorse");
        timeMap.put("46", "Pacific/Pitcairn");
        timeMap.put("51", "America/Boise");
        timeMap.put("52", "America/Cambridge_Bay");
        timeMap.put("53", "America/Chihuahua");
        timeMap.put("54", "America/Dawson_Creek");
        timeMap.put("55", "America/Denver");
        timeMap.put("56", "America/Edmonton");
        timeMap.put("57", "America/Hermosillo");
        timeMap.put("58", "America/Inuvik");
        timeMap.put("59", "America/Mazatlan");
        timeMap.put("60", "America/Ojinaga");
        timeMap.put("61", "America/Phoenix");
        timeMap.put("62", "America/Shiprock");
        timeMap.put("63", "America/Yellowknife");
        timeMap.put("75", "America/Bahia_Banderas");
        timeMap.put("76", "America/Belize");
        timeMap.put("77", "America/Cancun");
        timeMap.put("78", "America/Chicago");
        timeMap.put("79", "America/Costa_Rica");
        timeMap.put("80", "America/El_Salvador");
        timeMap.put("81", "America/Guatemala");
        timeMap.put("82", "America/Indiana/Knox");
        timeMap.put("83", "America/Indiana/Tell_City");
        timeMap.put("84", "America/Knox_IN");
        timeMap.put("85", "America/Managua");
        timeMap.put("86", "America/Matamoros");
        timeMap.put("87", "America/Menominee");
        timeMap.put("88", "America/Merida");
        timeMap.put("89", "America/Mexico_City");
        timeMap.put("90", "America/Monterrey");
        timeMap.put("91", "America/North_Dakota/Beulah");
        timeMap.put("92", "America/North_Dakota/Center");
        timeMap.put("93", "America/North_Dakota/New_Salem");
        timeMap.put("94", "America/Rainy_River");
        timeMap.put("95", "America/Rankin_Inlet");
        timeMap.put("96", "America/Regina");
        timeMap.put("97", "America/Resolute");
        timeMap.put("98", "America/Swift_Current");
        timeMap.put("99", "America/Tegucigalpa");
        timeMap.put("100", "America/Winnipeg");
        timeMap.put("109", "Pacific/Easter");
        timeMap.put("110", "Pacific/Galapagos");
        timeMap.put("115", "America/Atikokan");
        timeMap.put("116", "America/Bogota");
        timeMap.put("117", "America/Cayman");
        timeMap.put("118", "America/Coral_Harbour");
        timeMap.put("119", "America/Detroit");
        timeMap.put("120", "America/Fort_Wayne");
        timeMap.put("121", "America/Grand_Turk");
        timeMap.put("122", "America/Guayaquil");
        timeMap.put("123", "America/Havana");
        timeMap.put("124", "America/Indiana/Indianapolis");
        timeMap.put("125", "America/Indiana/Marengo");
        timeMap.put("126", "America/Indiana/Petersburg");
        timeMap.put("127", "America/Indiana/Vevay");
        timeMap.put("128", "America/Indiana/Vincennes");
        timeMap.put("129", "America/Indiana/Winamac");
        timeMap.put("130", "America/Indianapolis");
        timeMap.put("131", "America/Iqaluit");
        timeMap.put("132", "America/Jamaica");
        timeMap.put("133", "America/Kentucky/Louisville");
        timeMap.put("134", "America/Kentucky/Monticello");
        timeMap.put("135", "America/Lima");
        timeMap.put("136", "America/Louisville");
        timeMap.put("137", "America/Montreal");
        timeMap.put("138", "America/Nassau");
        timeMap.put("139", "America/New_York");
        timeMap.put("140", "America/Nipigon");
        timeMap.put("141", "America/Panama");
        timeMap.put("142", "America/Pangnirtung");
        timeMap.put("143", "America/Port-au-Prince");
        timeMap.put("144", "America/Thunder_Bay");
        timeMap.put("145", "America/Toronto");
        timeMap.put("158", "America/Caracas");
        timeMap.put("159", "America/Anguilla");
        timeMap.put("160", "America/Antigua");
        timeMap.put("161", "America/Argentina/San_Luis");
        timeMap.put("162", "America/Aruba");
        timeMap.put("163", "America/Asuncion");
        timeMap.put("164", "America/Barbados");
        timeMap.put("165", "America/Blanc-Sablon");
        timeMap.put("166", "America/Boa_Vista");
        timeMap.put("167", "America/Campo_Grande");
        timeMap.put("168", "America/Cuiaba");
        timeMap.put("169", "America/Curacao");
        timeMap.put("170", "America/Dominica");
        timeMap.put("171", "America/Eirunepe");
        timeMap.put("172", "America/Glace_Bay");
        timeMap.put("173", "America/Goose_Bay");
        timeMap.put("174", "America/Grenada");
        timeMap.put("175", "America/Guadeloupe");
        timeMap.put("176", "America/Guyana");
        timeMap.put("177", "America/Halifax");
        timeMap.put("178", "America/Kralendijk");
        timeMap.put("179", "America/La_Paz");
        timeMap.put("180", "America/Lower_Princes");
        timeMap.put("181", "America/Manaus");
        timeMap.put("182", "America/Marigot");
        timeMap.put("183", "America/Martinique");
        timeMap.put("184", "America/Moncton");
        timeMap.put("185", "America/Montserrat");
        timeMap.put("186", "America/Port_of_Spain");
        timeMap.put("187", "America/Porto_Acre");
        timeMap.put("188", "America/Porto_Velho");
        timeMap.put("189", "America/Puerto_Rico");
        timeMap.put("190", "America/Rio_Branco");
        timeMap.put("191", "America/Santiago");
        timeMap.put("192", "America/Santo_Domingo");
        timeMap.put("193", "America/St_Barthelemy");
        timeMap.put("194", "America/St_Kitts");
        timeMap.put("195", "America/St_Lucia");
        timeMap.put("196", "America/St_Thomas");
        timeMap.put("197", "America/St_Vincent");
        timeMap.put("198", "America/Thule");
        timeMap.put("199", "America/Tortola");
        timeMap.put("200", "America/Virgin");
        timeMap.put("201", "Antarctica/Palmer");
        timeMap.put("202", "Atlantic/Bermuda");
        timeMap.put("203", "Atlantic/Stanley");
        timeMap.put("212", "America/St_Johns");
        timeMap.put("216", "America/Araguaina");
        timeMap.put("217", "America/Argentina/Buenos_Aires");
        timeMap.put("218", "America/Argentina/Catamarca");
        timeMap.put("219", "America/Argentina/ComodRivadavia");
        timeMap.put("220", "America/Argentina/Cordoba");
        timeMap.put("221", "America/Argentina/Jujuy");
        timeMap.put("222", "America/Argentina/La_Rioja");
        timeMap.put("223", "America/Argentina/Mendoza");
        timeMap.put("224", "America/Argentina/Rio_Gallegos");
        timeMap.put("225", "America/Argentina/Salta");
        timeMap.put("226", "America/Argentina/San_Juan");
        timeMap.put("227", "America/Argentina/Tucuman");
        timeMap.put("228", "America/Argentina/Ushuaia");
        timeMap.put("229", "America/Bahia");
        timeMap.put("230", "America/Belem");
        timeMap.put("231", "America/Buenos_Aires");
        timeMap.put("232", "America/Catamarca");
        timeMap.put("233", "America/Cayenne");
        timeMap.put("234", "America/Cordoba");
        timeMap.put("235", "America/Fortaleza");
        timeMap.put("236", "America/Godthab");
        timeMap.put("237", "America/Jujuy");
        timeMap.put("238", "America/Maceio");
        timeMap.put("239", "America/Mendoza");
        timeMap.put("240", "America/Miquelon");
        timeMap.put("241", "America/Montevideo");
        timeMap.put("242", "America/Paramaribo");
        timeMap.put("243", "America/Recife");
        timeMap.put("244", "America/Rosario");
        timeMap.put("245", "America/Santarem");
        timeMap.put("246", "America/Sao_Paulo");
        timeMap.put("247", "Antarctica/Rothera");
        timeMap.put("251", "America/Noronha");
        timeMap.put("252", "Atlantic/South_Georgia");
        timeMap.put("255", "America/Scoresbysund");
        timeMap.put("256", "Atlantic/Azores");
        timeMap.put("257", "Atlantic/Cape_Verde");
        timeMap.put("259", "Africa/Abidjan");
        timeMap.put("260", "Africa/Accra");
        timeMap.put("261", "Africa/Bamako");
        timeMap.put("262", "Africa/Banjul");
        timeMap.put("263", "Africa/Bissau");
        timeMap.put("264", "Africa/Casablanca");
        timeMap.put("265", "Africa/Conakry");
        timeMap.put("266", "Africa/Dakar");
        timeMap.put("267", "Africa/El_Aaiun");
        timeMap.put("268", "Africa/Freetown");
        timeMap.put("269", "Africa/Lome");
        timeMap.put("270", "Africa/Monrovia");
        timeMap.put("271", "Africa/Nouakchott");
        timeMap.put("272", "Africa/Ouagadougou");
        timeMap.put("273", "Africa/Sao_Tome");
        timeMap.put("274", "Africa/Timbuktu");
        timeMap.put("275", "America/Danmarkshavn");
        timeMap.put("276", "Atlantic/Canary");
        timeMap.put("277", "Atlantic/Faeroe");
        timeMap.put("278", "Atlantic/Faroe");
        timeMap.put("279", "Atlantic/Madeira");
        timeMap.put("280", "Atlantic/Reykjavik");
        timeMap.put("281", "Atlantic/St_Helena");
        timeMap.put("289", "Etc/UTC");
        timeMap.put("292", "Europe/Belfast");
        timeMap.put("293", "Europe/Dublin");
        timeMap.put("294", "Europe/Guernsey");
        timeMap.put("295", "Europe/Isle_of_Man");
        timeMap.put("296", "Europe/Jersey");
        timeMap.put("297", "Europe/Lisbon");
        timeMap.put("298", "Europe/London");
        timeMap.put("311", "Africa/Algiers");
        timeMap.put("312", "Africa/Bangui");
        timeMap.put("313", "Africa/Brazzaville");
        timeMap.put("314", "Africa/Ceuta");
        timeMap.put("315", "Africa/Douala");
        timeMap.put("316", "Africa/Kinshasa");
        timeMap.put("317", "Africa/Lagos");
        timeMap.put("318", "Africa/Libreville");
        timeMap.put("319", "Africa/Luanda");
        timeMap.put("320", "Africa/Malabo");
        timeMap.put("321", "Africa/Ndjamena");
        timeMap.put("322", "Africa/Niamey");
        timeMap.put("323", "Africa/Porto-Novo");
        timeMap.put("324", "Africa/Tunis");
        timeMap.put("325", "Africa/Windhoek");
        timeMap.put("327", "Atlantic/Jan_Mayen");
        timeMap.put("331", "Europe/Amsterdam");
        timeMap.put("332", "Europe/Andorra");
        timeMap.put("333", "Europe/Belgrade");
        timeMap.put("334", "Europe/Berlin");
        timeMap.put("335", "Europe/Bratislava");
        timeMap.put("336", "Europe/Brussels");
        timeMap.put("337", "Europe/Budapest");
        timeMap.put("338", "Europe/Copenhagen");
        timeMap.put("339", "Europe/Gibraltar");
        timeMap.put("340", "Europe/Ljubljana");
        timeMap.put("341", "Europe/Luxembourg");
        timeMap.put("342", "Europe/Madrid");
        timeMap.put("343", "Europe/Malta");
        timeMap.put("344", "Europe/Monaco");
        timeMap.put("345", "Europe/Oslo");
        timeMap.put("346", "Europe/Paris");
        timeMap.put("347", "Europe/Podgorica");
        timeMap.put("348", "Europe/Prague");
        timeMap.put("349", "Europe/Rome");
        timeMap.put("350", "Europe/San_Marino");
        timeMap.put("351", "Europe/Sarajevo");
        timeMap.put("352", "Europe/Skopje");
        timeMap.put("353", "Europe/Stockholm");
        timeMap.put("354", "Europe/Tirane");
        timeMap.put("355", "Europe/Vaduz");
        timeMap.put("356", "Europe/Vatican");
        timeMap.put("357", "Europe/Vienna");
        timeMap.put("358", "Europe/Warsaw");
        timeMap.put("359", "Europe/Zagreb");
        timeMap.put("360", "Europe/Zurich");
        timeMap.put("364", "Africa/Blantyre");
        timeMap.put("365", "Africa/Bujumbura");
        timeMap.put("366", "Africa/Cairo");
        timeMap.put("367", "Africa/Gaborone");
        timeMap.put("368", "Africa/Harare");
        timeMap.put("369", "Africa/Johannesburg");
        timeMap.put("370", "Africa/Kigali");
        timeMap.put("371", "Africa/Lubumbashi");
        timeMap.put("372", "Africa/Lusaka");
        timeMap.put("373", "Africa/Maputo");
        timeMap.put("374", "Africa/Maseru");
        timeMap.put("375", "Africa/Mbabane");
        timeMap.put("376", "Africa/Tripoli");
        timeMap.put("377", "Asia/Amman");
        timeMap.put("378", "Asia/Beirut");
        timeMap.put("379", "Asia/Damascus");
        timeMap.put("380", "Asia/Gaza");
        timeMap.put("381", "Asia/Hebron");
        timeMap.put("382", "Asia/Istanbul");
        timeMap.put("383", "Asia/Jerusalem");
        timeMap.put("384", "Asia/Nicosia");
        timeMap.put("385", "Asia/Tel_Aviv");
        timeMap.put("390", "Europe/Athens");
        timeMap.put("391", "Europe/Bucharest");
        timeMap.put("392", "Europe/Chisinau");
        timeMap.put("393", "Europe/Helsinki");
        timeMap.put("394", "Europe/Istanbul");
        timeMap.put("395", "Europe/Mariehamn");
        timeMap.put("396", "Europe/Nicosia");
        timeMap.put("397", "Europe/Riga");
        timeMap.put("398", "Europe/Sofia");
        timeMap.put("399", "Europe/Tallinn");
        timeMap.put("400", "Europe/Tiraspol");
        timeMap.put("401", "Europe/Vilnius");
        timeMap.put("405", "Africa/Addis_Ababa");
        timeMap.put("406", "Africa/Asmara");
        timeMap.put("407", "Africa/Asmera");
        timeMap.put("408", "Africa/Dar_es_Salaam");
        timeMap.put("409", "Africa/Djibouti");
        timeMap.put("410", "Africa/Juba");
        timeMap.put("411", "Africa/Kampala");
        timeMap.put("412", "Africa/Khartoum");
        timeMap.put("413", "Africa/Mogadishu");
        timeMap.put("414", "Africa/Nairobi");
        timeMap.put("415", "Antarctica/Syowa");
        timeMap.put("416", "Asia/Aden");
        timeMap.put("417", "Asia/Baghdad");
        timeMap.put("418", "Asia/Bahrain");
        timeMap.put("419", "Asia/Kuwait");
        timeMap.put("420", "Asia/Qatar");
        timeMap.put("421", "Asia/Riyadh");
        timeMap.put("424", "Europe/Kaliningrad");
        timeMap.put("425", "Europe/Kiev");
        timeMap.put("426", "Europe/Minsk");
        timeMap.put("427", "Europe/Simferopol");
        timeMap.put("428", "Europe/Uzhgorod");
        timeMap.put("429", "Europe/Zaporozhye");
        timeMap.put("430", "Indian/Antananarivo");
        timeMap.put("431", "Indian/Comoro");
        timeMap.put("432", "Indian/Mayotte");
        timeMap.put("439", "Asia/Tehran");
        timeMap.put("441", "Asia/Baku");
        timeMap.put("442", "Asia/Dubai");
        timeMap.put("443", "Asia/Muscat");
        timeMap.put("444", "Asia/Tbilisi");
        timeMap.put("445", "Asia/Yerevan");
        timeMap.put("447", "Europe/Moscow");
        timeMap.put("448", "Europe/Samara");
        timeMap.put("449", "Europe/Volgograd");
        timeMap.put("450", "Indian/Mahe");
        timeMap.put("451", "Indian/Mauritius");
        timeMap.put("452", "Indian/Reunion");
        timeMap.put("455", "Asia/Kabul");
        timeMap.put("456", "Antarctica/Mawson");
        timeMap.put("457", "Asia/Aqtau");
        timeMap.put("458", "Asia/Aqtobe");
        timeMap.put("459", "Asia/Ashgabat");
        timeMap.put("460", "Asia/Ashkhabad");
        timeMap.put("461", "Asia/Dushanbe");
        timeMap.put("462", "Asia/Karachi");
        timeMap.put("463", "Asia/Oral");
        timeMap.put("464", "Asia/Samarkand");
        timeMap.put("465", "Asia/Tashkent");
        timeMap.put("467", "Indian/Kerguelen");
        timeMap.put("468", "Indian/Maldives");
        timeMap.put("470", "Asia/Calcutta");
        timeMap.put("471", "Asia/Colombo");
        timeMap.put("472", "Asia/Kolkata");
        timeMap.put("474", "Asia/Kathmandu");
        timeMap.put("475", "Asia/Katmandu");
        timeMap.put("476", "Antarctica/Vostok");
        timeMap.put("477", "Asia/Almaty");
        timeMap.put("478", "Asia/Bishkek");
        timeMap.put("479", "Asia/Dacca");
        timeMap.put("480", "Asia/Dhaka");
        timeMap.put("481", "Asia/Qyzylorda");
        timeMap.put("482", "Asia/Thimbu");
        timeMap.put("483", "Asia/Thimphu");
        timeMap.put("484", "Asia/Yekaterinburg");
        timeMap.put("487", "Indian/Chagos");
        timeMap.put("488", "Asia/Rangoon");
        timeMap.put("489", "Indian/Cocos");
        timeMap.put("490", "Antarctica/Davis");
        timeMap.put("491", "Asia/Bangkok");
        timeMap.put("492", "Asia/Ho_Chi_Minh");
        timeMap.put("493", "Asia/Hovd");
        timeMap.put("494", "Asia/Jakarta");
        timeMap.put("495", "Asia/Novokuznetsk");
        timeMap.put("496", "Asia/Novosibirsk");
        timeMap.put("497", "Asia/Omsk");
        timeMap.put("498", "Asia/Phnom_Penh");
        timeMap.put("499", "Asia/Pontianak");
        timeMap.put("500", "Asia/Saigon");
        timeMap.put("501", "Asia/Vientiane");
        timeMap.put("503", "Indian/Christmas");
        timeMap.put("505", "Antarctica/Casey");
        timeMap.put("506", "Asia/Brunei");
        timeMap.put("507", "Asia/Choibalsan");
        timeMap.put("508", "Asia/Chongqing");
        timeMap.put("509", "Asia/Chungking");
        timeMap.put("510", "Asia/Harbin");
        timeMap.put("511", "Asia/Hong_Kong");
        timeMap.put("512", "Asia/Kashgar");
        timeMap.put("513", "Asia/Krasnoyarsk");
        timeMap.put("514", "Asia/Kuala_Lumpur");
        timeMap.put("515", "Asia/Kuching");
        timeMap.put("516", "Asia/Macao");
        timeMap.put("517", "Asia/Macau");
        timeMap.put("518", "Asia/Makassar");
        timeMap.put("519", "Asia/Manila");
        timeMap.put("520", "Asia/Shanghai");
        timeMap.put("521", "Asia/Singapore");
        timeMap.put("522", "Asia/Taipei");
        timeMap.put("523", "Asia/Ujung_Pandang");
        timeMap.put("524", "Asia/Ulaanbaatar");
        timeMap.put("525", "Asia/Ulan_Bator");
        timeMap.put("526", "Asia/Urumqi");
        timeMap.put("527", "Australia/Perth");
        timeMap.put("528", "Australia/West");
        timeMap.put("534", "Australia/Eucla");
        timeMap.put("535", "Asia/Dili");
        timeMap.put("536", "Asia/Irkutsk");
        timeMap.put("537", "Asia/Jayapura");
        timeMap.put("538", "Asia/Pyongyang");
        timeMap.put("539", "Asia/Seoul");
        timeMap.put("540", "Asia/Tokyo");
        timeMap.put("544", "Pacific/Palau");
        timeMap.put("547", "Australia/Adelaide");
        timeMap.put("548", "Australia/Broken_Hill");
        timeMap.put("549", "Australia/Darwin");
        timeMap.put("550", "Australia/North");
        timeMap.put("551", "Australia/South");
        timeMap.put("552", "Australia/Yancowinna");
        timeMap.put("554", "Antarctica/DumontDUrville");
        timeMap.put("555", "Asia/Yakutsk");
        timeMap.put("556", "Australia/ACT");
        timeMap.put("557", "Australia/Brisbane");
        timeMap.put("558", "Australia/Canberra");
        timeMap.put("559", "Australia/Currie");
        timeMap.put("560", "Australia/Hobart");
        timeMap.put("561", "Australia/Lindeman");
        timeMap.put("562", "Australia/Melbourne");
        timeMap.put("563", "Australia/NSW");
        timeMap.put("564", "Australia/Queensland");
        timeMap.put("565", "Australia/Sydney");
        timeMap.put("566", "Australia/Tasmania");
        timeMap.put("567", "Australia/Victoria");
        timeMap.put("569", "Pacific/Chuuk");
        timeMap.put("570", "Pacific/Guam");
        timeMap.put("571", "Pacific/Port_Moresby");
        timeMap.put("572", "Pacific/Saipan");
        timeMap.put("573", "Pacific/Truk");
        timeMap.put("574", "Pacific/Yap");
        timeMap.put("575", "Australia/LHI");
        timeMap.put("576", "Australia/Lord_Howe");
        timeMap.put("577", "Antarctica/Macquarie");
        timeMap.put("578", "Asia/Sakhalin");
        timeMap.put("579", "Asia/Vladivostok");
        timeMap.put("581", "Pacific/Efate");
        timeMap.put("582", "Pacific/Guadalcanal");
        timeMap.put("583", "Pacific/Kosrae");
        timeMap.put("584", "Pacific/Noumea");
        timeMap.put("585", "Pacific/Pohnpei");
        timeMap.put("586", "Pacific/Ponape");
        timeMap.put("588", "Pacific/Norfolk");
        timeMap.put("589", "Antarctica/McMurdo");
        timeMap.put("590", "Antarctica/South_Pole");
        timeMap.put("591", "Asia/Anadyr");
        timeMap.put("592", "Asia/Kamchatka");
        timeMap.put("593", "Asia/Magadan");
        timeMap.put("598", "Pacific/Auckland");
        timeMap.put("599", "Pacific/Fiji");
        timeMap.put("600", "Pacific/Funafuti");
        timeMap.put("601", "Pacific/Kwajalein");
        timeMap.put("602", "Pacific/Majuro");
        timeMap.put("603", "Pacific/Nauru");
        timeMap.put("604", "Pacific/Tarawa");
        timeMap.put("605", "Pacific/Wake");
        timeMap.put("606", "Pacific/Wallis");
        timeMap.put("608", "Pacific/Chatham");
        timeMap.put("611", "Pacific/Apia");
        timeMap.put("612", "Pacific/Enderbury");
        timeMap.put("613", "Pacific/Tongatapu");
        timeMap.put("615", "Pacific/Kiritimati");

        final String[] keys = timeMap.keySet().toArray(new String[timeMap.size()]);

        jdbcTemplate.execute("ALTER TABLE `s_user` ADD COLUMN `YYMMDDFormat` VARCHAR(45) NULL, ADD COLUMN " +
                "`humanDateFormat` VARCHAR(45) NULL, ADD COLUMN `MMDDFormat` VARCHAR(45) NULL;");

        jdbcTemplate.batchUpdate("UPDATE s_user SET timezone=? WHERE timezone=?", new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                preparedStatement.setString(1, timeMap.get(keys[i]));
                preparedStatement.setString(2, keys[i]);
            }

            @Override
            public int getBatchSize() {
                return keys.length;
            }
        });

        jdbcTemplate.batchUpdate("UPDATE s_account SET defaultTimezone=? WHERE defaultTimezone=?", new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                preparedStatement.setString(1, timeMap.get(keys[i]));
                preparedStatement.setString(2, keys[i]);
            }

            @Override
            public int getBatchSize() {
                return keys.length;
            }
        });
    }
}
