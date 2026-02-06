package o;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* renamed from: o.aU1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5099aU1 extends C5827dU1 implements InterfaceC5584cU1 {
    public String[] i;
    public String[] j;
    public final Map<String, Integer> k = new HashMap();
    public Locale l = Locale.getDefault();

    public static /* synthetic */ String q(C5099aU1 c5099aU1, String[] strArr, String str) {
        return strArr[c5099aU1.k.get(str).intValue()];
    }

    @Override // o.C5827dU1, o.InterfaceC5584cU1
    public String[] a(ResultSet resultSet, boolean z) throws SQLException, IOException {
        if (this.k.isEmpty()) {
            u(resultSet);
        }
        return s(super.b(resultSet, z, this.a, this.b));
    }

    @Override // o.C5827dU1, o.InterfaceC5584cU1
    public String[] b(ResultSet resultSet, boolean z, String str, String str2) throws SQLException, IOException {
        if (this.k.isEmpty()) {
            u(resultSet);
        }
        return s(super.b(resultSet, z, str, str2));
    }

    @Override // o.C5827dU1, o.InterfaceC5584cU1
    public String[] c(ResultSet resultSet) throws SQLException, IOException {
        if (this.k.isEmpty()) {
            u(resultSet);
        }
        return s(super.b(resultSet, false, this.a, this.b));
    }

    @Override // o.C5827dU1, o.InterfaceC5584cU1
    public String[] d(ResultSet resultSet) throws SQLException {
        if (this.k.isEmpty()) {
            u(resultSet);
        }
        String[] strArr = this.j;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public final String[] s(final String[] strArr) {
        return (String[]) ((List) Stream.of((Object[]) this.i).map(new Function() { // from class: o.YT1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C5099aU1.q(C5099aU1.this, strArr, (String) obj);
            }
        }).collect(Collectors.toList())).toArray(C4206Se.u);
    }

    public final boolean t(String[] strArr) {
        return Stream.of((Object[]) strArr).anyMatch(new Predicate() { // from class: o.ZT1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean H0;
                H0 = C4500Ve2.H0((String) obj);
                return H0;
            }
        });
    }

    public final void u(ResultSet resultSet) throws SQLException {
        String[] strArr;
        String[] d = super.d(resultSet);
        if (this.i == null) {
            this.i = (String[]) Arrays.copyOf(d, d.length);
            this.j = (String[]) Arrays.copyOf(d, d.length);
        }
        for (String str : this.i) {
            int x0 = C4206Se.x0(d, str);
            if (x0 != -1) {
                this.k.put(str, Integer.valueOf(x0));
            } else {
                throw new UnsupportedOperationException(String.format(ResourceBundle.getBundle(UI0.k, this.l).getString("column.nonexistant"), str));
            }
        }
    }

    public void v(String[] strArr, String[] strArr2) {
        if (strArr2.length == strArr.length) {
            if (!t(strArr)) {
                if (!t(strArr2)) {
                    this.i = (String[]) Arrays.copyOf(strArr, strArr.length);
                    this.j = (String[]) Arrays.copyOf(strArr2, strArr2.length);
                    return;
                }
                throw new UnsupportedOperationException(ResourceBundle.getBundle(UI0.k, this.l).getString("header.name.bogus"));
            }
            throw new UnsupportedOperationException(ResourceBundle.getBundle(UI0.k, this.l).getString("column.name.bogus"));
        }
        throw new UnsupportedOperationException(ResourceBundle.getBundle(UI0.k, this.l).getString("column.count.mismatch"));
    }

    public void w(Locale locale) {
        this.l = (Locale) C11304zt1.t(locale, Locale.getDefault());
    }
}
