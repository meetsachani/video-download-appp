package o;

import android.media.MediaDrmException;
import android.os.PersistableBundle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C6960i70;
import o.InterfaceC3628Mg0;

@ES1(18)
@Deprecated
/* loaded from: classes2.dex */
public final class U70 implements InterfaceC3628Mg0 {
    public static U70 w() {
        return new U70();
    }

    @Override // o.InterfaceC3628Mg0
    @InterfaceC11300zs1
    public PersistableBundle b() {
        return null;
    }

    @Override // o.InterfaceC3628Mg0
    public Map<String, String> d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC3628Mg0
    public InterfaceC3628Mg0.h h() {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC3628Mg0
    public byte[] i() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // o.InterfaceC3628Mg0
    public void j(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC3628Mg0
    public void l(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC3628Mg0
    public int m() {
        return 1;
    }

    @Override // o.InterfaceC3628Mg0
    public String o(String str) {
        return "";
    }

    @Override // o.InterfaceC3628Mg0
    public InterfaceC7280jR p(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC3628Mg0
    public boolean r(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC3628Mg0
    public byte[] t(String str) {
        return TD2.f;
    }

    @Override // o.InterfaceC3628Mg0
    @InterfaceC11300zs1
    public byte[] u(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC3628Mg0
    public InterfaceC3628Mg0.b v(byte[] bArr, @InterfaceC11300zs1 List<C6960i70.b> list, int i, @InterfaceC11300zs1 HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC3628Mg0
    public void a() {
    }

    @Override // o.InterfaceC3628Mg0
    public void g() {
    }

    @Override // o.InterfaceC3628Mg0
    public void c(@InterfaceC11300zs1 InterfaceC3628Mg0.d dVar) {
    }

    @Override // o.InterfaceC3628Mg0
    public void e(@InterfaceC11300zs1 InterfaceC3628Mg0.e eVar) {
    }

    @Override // o.InterfaceC3628Mg0
    public void f(@InterfaceC11300zs1 InterfaceC3628Mg0.f fVar) {
    }

    @Override // o.InterfaceC3628Mg0
    public void s(byte[] bArr) {
    }

    @Override // o.InterfaceC3628Mg0
    public void k(String str, String str2) {
    }

    @Override // o.InterfaceC3628Mg0
    public void n(String str, byte[] bArr) {
    }
}
