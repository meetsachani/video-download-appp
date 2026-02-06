package o;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.uV1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9995uV1 extends AbstractC7779lU0 implements B80, Serializable {
    public int a1;
    public List<InterfaceC10878y80> b1;

    public C9995uV1(ResultSet resultSet) throws SQLException {
        this(resultSet, true, -1);
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
    public /* bridge */ /* synthetic */ void j(boolean z) {
        super.j(z);
    }

    public void k(ResultSet resultSet) throws SQLException {
        int i = 0;
        while (resultSet.next()) {
            int i2 = this.a1;
            if (i2 >= 0) {
                int i3 = i + 1;
                if (i < i2) {
                    i = i3;
                } else {
                    return;
                }
            }
            InterfaceC10878y80 m = m();
            for (C80 c80 : this.Z) {
                String b = c80.b();
                m.k(b, f(resultSet, b));
            }
            this.b1.add(m);
        }
    }

    public InterfaceC10878y80 m() {
        return new C4719Xl(this);
    }

    public List<InterfaceC10878y80> o() {
        return this.b1;
    }

    @Override // o.AbstractC7779lU0, o.B80
    public /* bridge */ /* synthetic */ C80 p(String str) {
        return super.p(str);
    }

    public C9995uV1(ResultSet resultSet, int i) throws SQLException {
        this(resultSet, true, i);
    }

    public C9995uV1(ResultSet resultSet, boolean z) throws SQLException {
        this(resultSet, z, -1);
    }

    public C9995uV1(ResultSet resultSet, boolean z, int i) throws SQLException {
        this(resultSet, z, i, false);
    }

    public C9995uV1(ResultSet resultSet, boolean z, boolean z2) throws SQLException {
        this(resultSet, z, -1, z2);
    }

    public C9995uV1(ResultSet resultSet, boolean z, int i, boolean z2) throws SQLException {
        this.a1 = -1;
        this.b1 = new ArrayList();
        resultSet.getClass();
        this.X = z;
        this.a1 = i;
        j(z2);
        g(resultSet);
        k(resultSet);
    }
}
