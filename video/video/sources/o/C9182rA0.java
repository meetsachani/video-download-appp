package o;

import android.database.Cursor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.rA0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9182rA0 {
    public static final String[] d = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    public final String a;
    public final Set<String> b;
    public final Set<String> c;

    public C9182rA0(String str, Set<String> set, Set<String> set2) {
        this.a = str;
        this.b = set;
        this.c = set2;
    }

    public static Set<String> a(String str) {
        if (str.isEmpty()) {
            return new HashSet();
        }
        String substring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        ArrayList<String> arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = -1;
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt != '\"' && charAt != '\'') {
                if (charAt != ',') {
                    if (charAt != '[') {
                        if (charAt != ']') {
                            if (charAt != '`') {
                            }
                        } else if (!arrayDeque.isEmpty() && ((Character) arrayDeque.peek()).charValue() == '[') {
                            arrayDeque.pop();
                        }
                    } else if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(charAt));
                    }
                } else if (arrayDeque.isEmpty()) {
                    arrayList.add(substring.substring(i + 1, i2).trim());
                    i = i2;
                }
            }
            if (arrayDeque.isEmpty()) {
                arrayDeque.push(Character.valueOf(charAt));
            } else if (((Character) arrayDeque.peek()).charValue() == charAt) {
                arrayDeque.pop();
            }
        }
        arrayList.add(substring.substring(i + 1).trim());
        HashSet hashSet = new HashSet();
        for (String str2 : arrayList) {
            for (String str3 : d) {
                if (str2.startsWith(str3)) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    public static C9182rA0 b(InterfaceC10528wh2 interfaceC10528wh2, String str) {
        return new C9182rA0(str, c(interfaceC10528wh2, str), d(interfaceC10528wh2, str));
    }

    public static Set<String> c(InterfaceC10528wh2 interfaceC10528wh2, String str) {
        Cursor u4 = interfaceC10528wh2.u4("PRAGMA table_info(`" + str + "`)");
        HashSet hashSet = new HashSet();
        try {
            if (u4.getColumnCount() > 0) {
                int columnIndex = u4.getColumnIndex("name");
                while (u4.moveToNext()) {
                    hashSet.add(u4.getString(columnIndex));
                }
            }
            return hashSet;
        } finally {
            u4.close();
        }
    }

    public static Set<String> d(InterfaceC10528wh2 interfaceC10528wh2, String str) {
        String str2;
        Cursor u4 = interfaceC10528wh2.u4("SELECT * FROM sqlite_master WHERE `name` = '" + str + "'");
        try {
            if (u4.moveToFirst()) {
                str2 = u4.getString(u4.getColumnIndexOrThrow("sql"));
            } else {
                str2 = "";
            }
            u4.close();
            return a(str2);
        } catch (Throwable th) {
            u4.close();
            throw th;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C9182rA0 c9182rA0 = (C9182rA0) obj;
            String str = this.a;
            if (str == null ? c9182rA0.a != null : !str.equals(c9182rA0.a)) {
                return false;
            }
            Set<String> set = this.b;
            if (set == null ? c9182rA0.b != null : !set.equals(c9182rA0.b)) {
                return false;
            }
            Set<String> set2 = this.c;
            Set<String> set3 = c9182rA0.c;
            if (set2 != null) {
                return set2.equals(set3);
            }
            if (set3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Set<String> set = this.b;
        if (set != null) {
            i2 = set.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Set<String> set2 = this.c;
        if (set2 != null) {
            i3 = set2.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        return "FtsTableInfo{name='" + this.a + "', columns=" + this.b + ", options=" + this.c + '}';
    }

    public C9182rA0(String str, Set<String> set, String str2) {
        this.a = str;
        this.b = set;
        this.c = a(str2);
    }
}
