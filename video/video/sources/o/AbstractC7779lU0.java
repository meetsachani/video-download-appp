package o;

import java.io.Serializable;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.lU0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7779lU0 implements B80, Serializable {
    public boolean Y;
    public Map<String, String> Z0;
    public boolean X = true;
    public C80[] Z = null;
    public Map<String, C80> Y0 = new HashMap();

    @Override // o.B80
    public InterfaceC10878y80 b() throws IllegalAccessException, InstantiationException {
        throw new UnsupportedOperationException("newInstance() not supported");
    }

    public C80 c(ResultSetMetaData resultSetMetaData, int i) throws SQLException {
        String str;
        String str2;
        Class<?> cls;
        String str3 = null;
        if (this.Y) {
            str = resultSetMetaData.getColumnLabel(i);
        } else {
            str = null;
        }
        if (str == null || str.trim().length() == 0) {
            str = resultSetMetaData.getColumnName(i);
        }
        if (this.X) {
            str2 = str.toLowerCase();
        } else {
            str2 = str;
        }
        if (!str2.equals(str)) {
            if (this.Z0 == null) {
                this.Z0 = new HashMap();
            }
            this.Z0.put(str2, str);
        }
        switch (resultSetMetaData.getColumnType(i)) {
            case 91:
                return new C80(str2, Date.class);
            case 92:
                return new C80(str2, Time.class);
            case 93:
                return new C80(str2, Timestamp.class);
            default:
                str3 = resultSetMetaData.getColumnClassName(i);
                if (str3 != null) {
                    cls = h(str3);
                } else {
                    cls = Object.class;
                }
                return new C80(str2, cls);
        }
    }

    public String d(String str) {
        Map<String, String> map = this.Z0;
        if (map != null && map.containsKey(str)) {
            return this.Z0.get(str);
        }
        return str;
    }

    @Override // o.B80
    public C80[] e() {
        return this.Z;
    }

    public Object f(ResultSet resultSet, String str) throws SQLException {
        C80 p = p(str);
        if (p != null) {
            String d = d(str);
            Class<?> c = p.c();
            if (c.equals(Date.class)) {
                return resultSet.getDate(d);
            }
            if (c.equals(Timestamp.class)) {
                return resultSet.getTimestamp(d);
            }
            if (c.equals(Time.class)) {
                return resultSet.getTime(d);
            }
            return resultSet.getObject(d);
        }
        throw new IllegalArgumentException("Invalid name '" + str + "'");
    }

    public void g(ResultSet resultSet) throws SQLException {
        ArrayList arrayList = new ArrayList();
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            C80 c = c(metaData, i);
            if (c != null) {
                arrayList.add(c);
            }
        }
        C80[] c80Arr = (C80[]) arrayList.toArray(new C80[arrayList.size()]);
        this.Z = c80Arr;
        for (C80 c80 : c80Arr) {
            this.Y0.put(c80.b(), c80);
        }
    }

    @Override // o.B80
    public String getName() {
        return getClass().getName();
    }

    public Class<?> h(String str) throws SQLException {
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                contextClassLoader = getClass().getClassLoader();
            }
            return Class.forName(str, false, contextClassLoader);
        } catch (Exception e) {
            throw new SQLException("Cannot load column class '" + str + "': " + e);
        }
    }

    public void j(boolean z) {
        this.Y = z;
    }

    @Override // o.B80
    public C80 p(String str) {
        if (str != null) {
            return this.Y0.get(str);
        }
        throw new IllegalArgumentException("No property name specified");
    }
}
