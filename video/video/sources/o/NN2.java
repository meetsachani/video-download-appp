package o;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import o.O71;

/* loaded from: classes.dex */
public interface NN2 {

    /* loaded from: classes.dex */
    public enum a {
        ASCENDING,
        DESCENDING
    }

    void A(int i, Object obj) throws IOException;

    void B(int i, long j) throws IOException;

    void C(int i, boolean z) throws IOException;

    void D(int i, List<?> list, InterfaceC9026qY1 interfaceC9026qY1) throws IOException;

    void E(int i, int i2) throws IOException;

    @Deprecated
    void F(int i) throws IOException;

    void G(int i, List<Long> list, boolean z) throws IOException;

    void H(int i, List<Integer> list, boolean z) throws IOException;

    void I(int i, List<Boolean> list, boolean z) throws IOException;

    @Deprecated
    void J(int i, Object obj) throws IOException;

    <K, V> void K(int i, O71.b<K, V> bVar, Map<K, V> map) throws IOException;

    void L(int i, float f) throws IOException;

    @Deprecated
    void M(int i) throws IOException;

    void N(int i, List<Integer> list, boolean z) throws IOException;

    void O(int i, int i2) throws IOException;

    void P(int i, List<Long> list, boolean z) throws IOException;

    void Q(int i, List<Double> list, boolean z) throws IOException;

    void R(int i, int i2) throws IOException;

    void S(int i, List<AbstractC8616os> list) throws IOException;

    void a(int i, List<Float> list, boolean z) throws IOException;

    void b(int i, Object obj) throws IOException;

    void c(int i, int i2) throws IOException;

    @Deprecated
    void d(int i, List<?> list) throws IOException;

    void e(int i, AbstractC8616os abstractC8616os) throws IOException;

    void f(int i, List<String> list) throws IOException;

    void g(int i, String str) throws IOException;

    void h(int i, long j) throws IOException;

    void i(int i, Object obj, InterfaceC9026qY1 interfaceC9026qY1) throws IOException;

    void j(int i, List<Integer> list, boolean z) throws IOException;

    @Deprecated
    void k(int i, List<?> list, InterfaceC9026qY1 interfaceC9026qY1) throws IOException;

    void l(int i, int i2) throws IOException;

    void m(int i, long j) throws IOException;

    void n(int i, List<Integer> list, boolean z) throws IOException;

    void o(int i, List<Integer> list, boolean z) throws IOException;

    void p(int i, List<Long> list, boolean z) throws IOException;

    void q(int i, long j) throws IOException;

    void r(int i, List<Integer> list, boolean z) throws IOException;

    void s(int i, int i2) throws IOException;

    @Deprecated
    void t(int i, Object obj, InterfaceC9026qY1 interfaceC9026qY1) throws IOException;

    void u(int i, double d) throws IOException;

    void v(int i, List<Long> list, boolean z) throws IOException;

    void w(int i, List<Long> list, boolean z) throws IOException;

    void x(int i, long j) throws IOException;

    a y();

    void z(int i, List<?> list) throws IOException;
}
