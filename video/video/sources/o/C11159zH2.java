package o;

import android.database.Cursor;

/* renamed from: o.zH2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11159zH2 {
    public final String a;
    public final String b;

    public C11159zH2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static C11159zH2 a(InterfaceC10528wh2 interfaceC10528wh2, String str) {
        Cursor u4 = interfaceC10528wh2.u4("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + str + "'");
        try {
            if (u4.moveToFirst()) {
                return new C11159zH2(u4.getString(0), u4.getString(1));
            }
            return new C11159zH2(str, null);
        } finally {
            u4.close();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C11159zH2 c11159zH2 = (C11159zH2) obj;
            String str = this.a;
            if (str == null ? c11159zH2.a == null : str.equals(c11159zH2.a)) {
                String str2 = this.b;
                if (str2 == null ? c11159zH2.b == null : str2.equals(c11159zH2.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "ViewInfo{name='" + this.a + "', sql='" + this.b + "'}";
    }
}
