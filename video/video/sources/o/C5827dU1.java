package o;

import java.io.IOException;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Objects;

/* renamed from: o.dU1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5827dU1 implements InterfaceC5584cU1 {
    public static final int e = 2048;
    public static final String f = "dd-MMM-yyyy";
    public static final String g = "dd-MMM-yyyy HH:mm:ss";
    public static final String h = "";
    public String a = f;
    public String b = g;
    public NumberFormat c;
    public NumberFormat d;

    @Override // o.InterfaceC5584cU1
    public String[] a(ResultSet resultSet, boolean z) throws SQLException, IOException {
        return b(resultSet, z, this.a, this.b);
    }

    @Override // o.InterfaceC5584cU1
    public String[] b(ResultSet resultSet, boolean z, String str, String str2) throws SQLException, IOException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        String[] strArr = new String[metaData.getColumnCount()];
        int i = 1;
        while (i <= metaData.getColumnCount()) {
            ResultSet resultSet2 = resultSet;
            strArr[i - 1] = f(resultSet2, metaData.getColumnType(i), i, z, str, str2);
            i++;
            resultSet = resultSet2;
        }
        return strArr;
    }

    @Override // o.InterfaceC5584cU1
    public String[] c(ResultSet resultSet) throws SQLException, IOException {
        return b(resultSet, false, this.a, this.b);
    }

    @Override // o.InterfaceC5584cU1
    public String[] d(ResultSet resultSet) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        String[] strArr = new String[metaData.getColumnCount()];
        int i = 0;
        while (i < metaData.getColumnCount()) {
            int i2 = i + 1;
            strArr[i] = metaData.getColumnLabel(i2);
            i = i2;
        }
        return strArr;
    }

    public final String e(NumberFormat numberFormat, Number number) {
        if (number != null && numberFormat != null) {
            return numberFormat.format(number);
        }
        return Objects.toString(number, "");
    }

    public final String f(ResultSet resultSet, int i, int i2, boolean z, String str, String str2) throws SQLException, IOException {
        String j;
        if (i != -16 && i != -15 && i != -9) {
            if (i != -1 && i != 12) {
                if (i != 16) {
                    if (i != 2005) {
                        if (i != 2011) {
                            if (i != -6) {
                                if (i != -5) {
                                    switch (i) {
                                        case 1:
                                            break;
                                        case 2:
                                        case 3:
                                        case 7:
                                            j = e(this.d, resultSet.getBigDecimal(i2));
                                            break;
                                        case 4:
                                        case 5:
                                            break;
                                        case 6:
                                            j = e(this.d, Float.valueOf(resultSet.getFloat(i2)));
                                            break;
                                        case 8:
                                            j = e(this.d, Double.valueOf(resultSet.getDouble(i2)));
                                            break;
                                        default:
                                            switch (i) {
                                                case 91:
                                                    j = h(resultSet, i2, str);
                                                    break;
                                                case 92:
                                                    j = Objects.toString(resultSet.getTime(i2), "");
                                                    break;
                                                case 93:
                                                    j = k(resultSet.getTimestamp(i2), str2);
                                                    break;
                                                default:
                                                    j = Objects.toString(resultSet.getObject(i2), "");
                                                    break;
                                            }
                                    }
                                } else {
                                    j = e(this.c, resultSet.getBigDecimal(i2));
                                }
                            }
                            j = e(this.c, Integer.valueOf(resultSet.getInt(i2)));
                        } else {
                            j = i(resultSet, i2);
                        }
                    } else {
                        j = g(resultSet, i2);
                    }
                } else {
                    j = Objects.toString(Boolean.valueOf(resultSet.getBoolean(i2)));
                }
            }
            j = l(resultSet, i2, z);
        } else {
            j = j(resultSet, i2, z);
        }
        if (resultSet.wasNull() || j == null) {
            return "";
        }
        return j;
    }

    public String g(ResultSet resultSet, int i) throws SQLException, IOException {
        Clob clob = resultSet.getClob(i);
        if (clob != null) {
            C4726Xm2 c4726Xm2 = new C4726Xm2();
            c4726Xm2.q1(clob.getCharacterStream());
            return c4726Xm2.toString();
        }
        return "";
    }

    public String h(ResultSet resultSet, int i, String str) throws SQLException {
        Date date = resultSet.getDate(i);
        if (date != null) {
            return new SimpleDateFormat(str).format((java.util.Date) date);
        }
        return "";
    }

    public String i(ResultSet resultSet, int i) throws SQLException, IOException {
        NClob nClob = resultSet.getNClob(i);
        if (nClob != null) {
            C4726Xm2 c4726Xm2 = new C4726Xm2();
            c4726Xm2.q1(nClob.getCharacterStream());
            return c4726Xm2.toString();
        }
        return "";
    }

    public String j(ResultSet resultSet, int i, boolean z) throws SQLException {
        String nString = resultSet.getNString(i);
        if (z && nString != null) {
            return nString.trim();
        }
        return nString;
    }

    public String k(Timestamp timestamp, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        if (timestamp == null) {
            return null;
        }
        return simpleDateFormat.format((java.util.Date) timestamp);
    }

    public String l(ResultSet resultSet, int i, boolean z) throws SQLException {
        String string = resultSet.getString(i);
        if (z && string != null) {
            return string.trim();
        }
        return string;
    }

    public void m(String str) {
        this.a = str;
    }

    public void n(String str) {
        this.b = str;
    }

    public void o(NumberFormat numberFormat) {
        this.d = numberFormat;
    }

    public void p(NumberFormat numberFormat) {
        this.c = numberFormat;
    }
}
