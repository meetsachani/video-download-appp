package o;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/* loaded from: classes3.dex */
public interface VI0 extends Closeable, Flushable {
    public static final String C = "\n";
    public static final String D = "\r\n";
    public static final int E = 1024;
    public static final char F = '\"';
    public static final char G = ',';
    public static final char H = '\"';
    public static final char I = 0;
    public static final char J = 0;

    default void J2(List<String[]> list) {
        x2(list);
    }

    void K2(String[] strArr, boolean z);

    default int L0(ResultSet resultSet, boolean z) throws SQLException, IOException {
        return T4(resultSet, z, false, true);
    }

    default int M2(ResultSet resultSet, boolean z, boolean z2) throws SQLException, IOException {
        return T4(resultSet, z, z2, true);
    }

    int T4(ResultSet resultSet, boolean z, boolean z2, boolean z3) throws SQLException, IOException;

    IOException Y0();

    void b4(InterfaceC5584cU1 interfaceC5584cU1);

    boolean checkError();

    default void h2(List<String[]> list, boolean z) {
        q2(list, z);
    }

    void q2(Iterable<String[]> iterable, boolean z);

    default void q4() {
        try {
            flush();
        } catch (IOException unused) {
        }
    }

    void v0();

    default void v3(String[] strArr) {
        K2(strArr, true);
    }

    default void x2(Iterable<String[]> iterable) {
        q2(iterable, true);
    }
}
