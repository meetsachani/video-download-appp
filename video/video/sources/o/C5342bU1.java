package o;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

/* renamed from: o.bU1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5342bU1 extends AbstractC7779lU0 implements B80 {
    public ResultSet a1;

    public C5342bU1(ResultSet resultSet) throws SQLException {
        this(resultSet, true);
    }

    @Override // o.AbstractC7779lU0, o.B80
    public /* bridge */ /* synthetic */ InterfaceC10878y80 b() throws IllegalAccessException, InstantiationException {
        return super.b();
    }

    @Override // o.AbstractC7779lU0, o.B80
    public /* bridge */ /* synthetic */ C80[] e() {
        return super.e();
    }

    @Override // o.AbstractC7779lU0, o.B80
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    @Override // o.AbstractC7779lU0
    public Class<?> h(String str) throws SQLException {
        try {
            return getClass().getClassLoader().loadClass(str);
        } catch (Exception e) {
            throw new SQLException("Cannot load column class '" + str + "': " + e);
        }
    }

    @Override // o.AbstractC7779lU0
    public /* bridge */ /* synthetic */ void j(boolean z) {
        super.j(z);
    }

    public Object k(String str) throws SQLException {
        return f(m(), str);
    }

    public ResultSet m() {
        return this.a1;
    }

    public Iterator<InterfaceC10878y80> o() {
        return new C6069eU1(this);
    }

    @Override // o.AbstractC7779lU0, o.B80
    public /* bridge */ /* synthetic */ C80 p(String str) {
        return super.p(str);
    }

    public C5342bU1(ResultSet resultSet, boolean z) throws SQLException {
        this(resultSet, z, false);
    }

    public C5342bU1(ResultSet resultSet, boolean z, boolean z2) throws SQLException {
        this.a1 = null;
        resultSet.getClass();
        this.a1 = resultSet;
        this.X = z;
        j(z2);
        g(resultSet);
    }
}
