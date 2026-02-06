package o;

import androidx.lifecycle.LiveData;
import java.util.List;
import o.C8501oN2;
import o.TM2;

/* renamed from: o.pN2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8744pN2 {
    boolean A();

    int B(String id);

    List<C8501oN2.c> C(String tag);

    LiveData<List<C8501oN2.c>> D(List<String> ids);

    int E(String id);

    void F(String id, long periodStartTime);

    List<C8501oN2.c> G(List<String> ids);

    List<String> H();

    void a(String id);

    void b(C8501oN2 workSpec);

    void c();

    List<C8501oN2> d(long startingAt);

    List<C8501oN2> e();

    C8501oN2[] f(List<String> ids);

    List<String> g(String name);

    C8501oN2.c h(String id);

    TM2.a i(String id);

    C8501oN2 j(String id);

    LiveData<Long> k(String id);

    List<String> l(String tag);

    List<androidx.work.b> m(String id);

    List<C8501oN2.c> n(String name);

    List<C8501oN2> o(int maxLimit);

    int p();

    int q(String id, long startTime);

    List<C8501oN2.b> r(String name);

    List<C8501oN2> s(int schedulerLimit);

    int t(TM2.a state, String... ids);

    void u(String id, androidx.work.b output);

    LiveData<List<String>> v();

    LiveData<List<C8501oN2.c>> w(String name);

    List<C8501oN2> x();

    LiveData<List<C8501oN2.c>> y(String tag);

    List<String> z();
}
