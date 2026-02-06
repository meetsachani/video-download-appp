package o;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.List;

/* renamed from: o.Jw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3398Jw1 extends C3300Iw1 {
    public C3398Jw1(Surface surface) {
        super(new OutputConfiguration(surface));
    }

    public static C3398Jw1 t(OutputConfiguration outputConfiguration) {
        return new C3398Jw1(outputConfiguration);
    }

    @Override // o.C3496Kw1, o.C3006Fw1.a
    public void a(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) m()).setStreamUseCase(j);
    }

    @Override // o.C3202Hw1, o.C3496Kw1, o.C3006Fw1.a
    public /* bridge */ /* synthetic */ void b(Surface surface) {
        super.b(surface);
    }

    @Override // o.C3300Iw1, o.C3202Hw1, o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public void c(long j) {
        ((OutputConfiguration) m()).setDynamicRangeProfile(j);
    }

    @Override // o.C3300Iw1, o.C3202Hw1, o.C3496Kw1, o.C3006Fw1.a
    public /* bridge */ /* synthetic */ void d(Surface surface) {
        super.d(surface);
    }

    @Override // o.C3300Iw1, o.C3202Hw1, o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public /* bridge */ /* synthetic */ void e(String str) {
        super.e(str);
    }

    @Override // o.C3496Kw1
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // o.C3300Iw1, o.C3202Hw1, o.C3496Kw1, o.C3006Fw1.a
    public /* bridge */ /* synthetic */ int f() {
        return super.f();
    }

    @Override // o.C3202Hw1, o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public /* bridge */ /* synthetic */ List g() {
        return super.g();
    }

    @Override // o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public /* bridge */ /* synthetic */ Surface getSurface() {
        return super.getSurface();
    }

    @Override // o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public /* bridge */ /* synthetic */ int h() {
        return super.h();
    }

    @Override // o.C3496Kw1
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // o.C3300Iw1, o.C3202Hw1, o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public /* bridge */ /* synthetic */ String i() {
        return super.i();
    }

    @Override // o.C3202Hw1, o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // o.C3496Kw1, o.C3006Fw1.a
    public long k() {
        return ((OutputConfiguration) m()).getStreamUseCase();
    }

    @Override // o.C3300Iw1, o.C3202Hw1, o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public long l() {
        return ((OutputConfiguration) m()).getDynamicRangeProfile();
    }

    @Override // o.C3300Iw1, o.C3202Hw1, o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public Object m() {
        C10907yF1.a(this.a instanceof OutputConfiguration);
        return this.a;
    }

    public C3398Jw1(int i, Surface surface) {
        this(new OutputConfiguration(i, surface));
    }

    public C3398Jw1(Object obj) {
        super(obj);
    }
}
