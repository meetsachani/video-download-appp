package o;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: o.Ok2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3842Ok2 {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public final String a;
    public final Map<String, a> b;
    public final Set<b> c;
    public final Set<d> d;

    /* renamed from: o.Ok2$a */
    /* loaded from: classes.dex */
    public static class a {
        public final String a;
        public final String b;
        public final int c;
        public final boolean d;
        public final int e;
        public final String f;
        public final int g;

        @Deprecated
        public a(String str, String str2, boolean z, int i) {
            this(str, str2, z, i, null, 0);
        }

        public static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (!upperCase.contains("CHAR") && !upperCase.contains("CLOB") && !upperCase.contains("TEXT")) {
                if (upperCase.contains("BLOB")) {
                    return 5;
                }
                if (!upperCase.contains("REAL") && !upperCase.contains("FLOA") && !upperCase.contains("DOUB")) {
                    return 1;
                }
                return 4;
            }
            return 2;
        }

        public boolean b() {
            if (this.e > 0) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.e != aVar.e || !this.a.equals(aVar.a) || this.d != aVar.d) {
                    return false;
                }
                if (this.g == 1 && aVar.g == 2 && (str3 = this.f) != null && !str3.equals(aVar.f)) {
                    return false;
                }
                if (this.g == 2 && aVar.g == 1 && (str2 = aVar.f) != null && !str2.equals(this.f)) {
                    return false;
                }
                int i = this.g;
                if ((i == 0 || i != aVar.g || ((str = this.f) == null ? aVar.f == null : str.equals(aVar.f))) && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = ((this.a.hashCode() * 31) + this.c) * 31;
            if (this.d) {
                i = 1231;
            } else {
                i = 1237;
            }
            return ((hashCode + i) * 31) + this.e;
        }

        public String toString() {
            return "Column{name='" + this.a + "', type='" + this.b + "', affinity='" + this.c + "', notNull=" + this.d + ", primaryKeyPosition=" + this.e + ", defaultValue='" + this.f + "'}";
        }

        public a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.a = str;
            this.b = str2;
            this.d = z;
            this.e = i;
            this.c = a(str2);
            this.f = str3;
            this.g = i2;
        }
    }

    /* renamed from: o.Ok2$b */
    /* loaded from: classes.dex */
    public static class b {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = Collections.unmodifiableList(list);
            this.e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.a.equals(bVar.a) || !this.b.equals(bVar.b) || !this.c.equals(bVar.c) || !this.d.equals(bVar.d)) {
                return false;
            }
            return this.e.equals(bVar.e);
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + "', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
        }
    }

    /* renamed from: o.Ok2$c */
    /* loaded from: classes.dex */
    public static class c implements Comparable<c> {
        public final int X;
        public final int Y;
        public final String Y0;
        public final String Z;

        public c(int i, int i2, String str, String str2) {
            this.X = i;
            this.Y = i2;
            this.Z = str;
            this.Y0 = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(c cVar) {
            int i = this.X - cVar.X;
            if (i == 0) {
                return this.Y - cVar.Y;
            }
            return i;
        }
    }

    /* renamed from: o.Ok2$d */
    /* loaded from: classes.dex */
    public static class d {
        public static final String d = "index_";
        public final String a;
        public final boolean b;
        public final List<String> c;

        public d(String str, boolean z, List<String> list) {
            this.a = str;
            this.b = z;
            this.c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.b != dVar.b || !this.c.equals(dVar.c)) {
                return false;
            }
            if (this.a.startsWith(d)) {
                return dVar.a.startsWith(d);
            }
            return this.a.equals(dVar.a);
        }

        public int hashCode() {
            int hashCode;
            if (this.a.startsWith(d)) {
                hashCode = -1184239155;
            } else {
                hashCode = this.a.hashCode();
            }
            return (((hashCode * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + '}';
        }
    }

    public C3842Ok2(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        this.d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static C3842Ok2 a(InterfaceC10528wh2 interfaceC10528wh2, String str) {
        return new C3842Ok2(str, b(interfaceC10528wh2, str), d(interfaceC10528wh2, str), f(interfaceC10528wh2, str));
    }

    public static Map<String, a> b(InterfaceC10528wh2 interfaceC10528wh2, String str) {
        boolean z;
        Cursor u4 = interfaceC10528wh2.u4("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (u4.getColumnCount() > 0) {
                int columnIndex = u4.getColumnIndex("name");
                int columnIndex2 = u4.getColumnIndex("type");
                int columnIndex3 = u4.getColumnIndex("notnull");
                int columnIndex4 = u4.getColumnIndex("pk");
                int columnIndex5 = u4.getColumnIndex("dflt_value");
                while (u4.moveToNext()) {
                    String string = u4.getString(columnIndex);
                    String string2 = u4.getString(columnIndex2);
                    if (u4.getInt(columnIndex3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hashMap.put(string, new a(string, string2, z, u4.getInt(columnIndex4), u4.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            u4.close();
        }
    }

    public static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static Set<b> d(InterfaceC10528wh2 interfaceC10528wh2, String str) {
        HashSet hashSet = new HashSet();
        Cursor u4 = interfaceC10528wh2.u4("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = u4.getColumnIndex("id");
            int columnIndex2 = u4.getColumnIndex("seq");
            int columnIndex3 = u4.getColumnIndex("table");
            int columnIndex4 = u4.getColumnIndex("on_delete");
            int columnIndex5 = u4.getColumnIndex("on_update");
            List<c> c2 = c(u4);
            int count = u4.getCount();
            for (int i = 0; i < count; i++) {
                u4.moveToPosition(i);
                if (u4.getInt(columnIndex2) == 0) {
                    int i2 = u4.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : c2) {
                        if (cVar.X == i2) {
                            arrayList.add(cVar.Z);
                            arrayList2.add(cVar.Y0);
                        }
                    }
                    hashSet.add(new b(u4.getString(columnIndex3), u4.getString(columnIndex4), u4.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            u4.close();
            return hashSet;
        } catch (Throwable th) {
            u4.close();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public static d e(InterfaceC10528wh2 interfaceC10528wh2, String str, boolean z) {
        Cursor u4 = interfaceC10528wh2.u4("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = u4.getColumnIndex("seqno");
            int columnIndex2 = u4.getColumnIndex(C10415wE.k);
            int columnIndex3 = u4.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (u4.moveToNext()) {
                    if (u4.getInt(columnIndex2) >= 0) {
                        int i = u4.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i), u4.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d dVar = new d(str, z, arrayList);
                u4.close();
                return dVar;
            }
            u4.close();
            return null;
        } catch (Throwable th) {
            u4.close();
            throw th;
        }
    }

    public static Set<d> f(InterfaceC10528wh2 interfaceC10528wh2, String str) {
        Cursor u4 = interfaceC10528wh2.u4("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = u4.getColumnIndex("name");
            int columnIndex2 = u4.getColumnIndex("origin");
            int columnIndex3 = u4.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (u4.moveToNext()) {
                    if ("c".equals(u4.getString(columnIndex2))) {
                        String string = u4.getString(columnIndex);
                        boolean z = true;
                        if (u4.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        d e2 = e(interfaceC10528wh2, string, z);
                        if (e2 == null) {
                            return null;
                        }
                        hashSet.add(e2);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            u4.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3842Ok2 c3842Ok2 = (C3842Ok2) obj;
        String str = this.a;
        if (str == null ? c3842Ok2.a != null : !str.equals(c3842Ok2.a)) {
            return false;
        }
        Map<String, a> map = this.b;
        if (map == null ? c3842Ok2.b != null : !map.equals(c3842Ok2.b)) {
            return false;
        }
        Set<b> set2 = this.c;
        if (set2 == null ? c3842Ok2.c != null : !set2.equals(c3842Ok2.c)) {
            return false;
        }
        Set<d> set3 = this.d;
        if (set3 == null || (set = c3842Ok2.d) == null) {
            return true;
        }
        return set3.equals(set);
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
        Map<String, a> map = this.b;
        if (map != null) {
            i2 = map.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Set<b> set = this.c;
        if (set != null) {
            i3 = set.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }

    public C3842Ok2(String str, Map<String, a> map, Set<b> set) {
        this(str, map, set, Collections.EMPTY_SET);
    }
}
