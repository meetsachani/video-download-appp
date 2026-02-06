package o;

/* loaded from: classes.dex */
public class WU1 {
    public static final String a = "room_master_table";
    public static final String b = "room_master_table";
    public static final String c = "id";
    public static final String d = "identity_hash";
    public static final String e = "42";
    public static final String f = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";
    public static final String g = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    public static String a(String str) {
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
