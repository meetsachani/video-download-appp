package o;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import o.InterfaceC9058qh;

@Deprecated
/* renamed from: o.Nx0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3791Nx0 implements InterfaceC9058qh {
    public final InterfaceC9058qh e;

    public C3791Nx0(InterfaceC9058qh interfaceC9058qh) {
        this.e = interfaceC9058qh;
    }

    @Override // o.InterfaceC9058qh
    public boolean a(C10833xx0 c10833xx0) {
        return this.e.a(c10833xx0);
    }

    @Override // o.InterfaceC9058qh
    @InterfaceC11300zs1
    public C9546sg b() {
        return this.e.b();
    }

    @Override // o.InterfaceC9058qh
    public boolean c() {
        return this.e.c();
    }

    @Override // o.InterfaceC9058qh
    public void d(int i) {
        this.e.d(i);
    }

    @Override // o.InterfaceC9058qh
    public void f(DD1 dd1) {
        this.e.f(dd1);
    }

    @Override // o.InterfaceC9058qh
    public void flush() {
        this.e.flush();
    }

    @Override // o.InterfaceC9058qh
    public DD1 h() {
        return this.e.h();
    }

    @Override // o.InterfaceC9058qh
    public void i(C3737Nj c3737Nj) {
        this.e.i(c3737Nj);
    }

    @Override // o.InterfaceC9058qh
    public boolean j() {
        return this.e.j();
    }

    @Override // o.InterfaceC9058qh
    public void k(boolean z) {
        this.e.k(z);
    }

    @Override // o.InterfaceC9058qh
    public void l(@InterfaceC11300zs1 ND1 nd1) {
        this.e.l(nd1);
    }

    @Override // o.InterfaceC9058qh
    public boolean m() {
        return this.e.m();
    }

    @Override // o.InterfaceC9058qh
    public void n(C9546sg c9546sg) {
        this.e.n(c9546sg);
    }

    @Override // o.InterfaceC9058qh
    public void o() {
        this.e.o();
    }

    @Override // o.InterfaceC9058qh
    public void p(InterfaceC9058qh.c cVar) {
        this.e.p(cVar);
    }

    @Override // o.InterfaceC9058qh
    public void pause() {
        this.e.pause();
    }

    @Override // o.InterfaceC9058qh
    public boolean q(ByteBuffer byteBuffer, long j, int i) throws InterfaceC9058qh.b, InterfaceC9058qh.f {
        return this.e.q(byteBuffer, j, i);
    }

    @Override // o.InterfaceC9058qh
    public void r() {
        this.e.r();
    }

    @Override // o.InterfaceC9058qh
    public void reset() {
        this.e.reset();
    }

    @Override // o.InterfaceC9058qh
    public int s(C10833xx0 c10833xx0) {
        return this.e.s(c10833xx0);
    }

    @Override // o.InterfaceC9058qh
    @ES1(23)
    public void setPreferredDevice(@InterfaceC11300zs1 AudioDeviceInfo audioDeviceInfo) {
        this.e.setPreferredDevice(audioDeviceInfo);
    }

    @Override // o.InterfaceC9058qh
    public void setVolume(float f) {
        this.e.setVolume(f);
    }

    @Override // o.InterfaceC9058qh
    public void t() throws InterfaceC9058qh.f {
        this.e.t();
    }

    @Override // o.InterfaceC9058qh
    public void t0() {
        this.e.t0();
    }

    @Override // o.InterfaceC9058qh
    public void u(C10833xx0 c10833xx0, int i, @InterfaceC11300zs1 int[] iArr) throws InterfaceC9058qh.a {
        this.e.u(c10833xx0, i, iArr);
    }

    @Override // o.InterfaceC9058qh
    public long v(boolean z) {
        return this.e.v(z);
    }

    @Override // o.InterfaceC9058qh
    public void w(long j) {
        this.e.w(j);
    }

    @Override // o.InterfaceC9058qh
    public void x() {
        this.e.x();
    }

    @Override // o.InterfaceC9058qh
    public void y() {
        this.e.y();
    }
}
