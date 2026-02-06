package o;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o.C6960i70;
import o.InterfaceC3628Mg0;

@ES1(18)
@Deprecated
/* renamed from: o.eA0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5988eA0 implements InterfaceC3628Mg0 {
    public static final String j = "FrameworkMediaDrm";
    public static final InterfaceC3628Mg0.g k = new InterfaceC3628Mg0.g() { // from class: o.Xz0
        @Override // o.InterfaceC3628Mg0.g
        public final InterfaceC3628Mg0 a(UUID uuid) {
            return C5988eA0.w(uuid);
        }
    };
    public static final String l = "cenc";
    public static final String m = "https://x";
    public static final String n = "<LA_URL>https://x</LA_URL>";

    /* renamed from: o  reason: collision with root package name */
    public static final int f721o = 2;
    public final UUID g;
    public final MediaDrm h;
    public int i;

    @ES1(31)
    /* renamed from: o.eA0$a */
    /* loaded from: classes2.dex */
    public static class a {
        @K40
        public static boolean a(MediaDrm mediaDrm, String str) {
            return C5018aA0.a(mediaDrm, str);
        }

        @K40
        public static void b(MediaDrm mediaDrm, byte[] bArr, ND1 nd1) {
            LogSessionId logSessionId;
            boolean equals;
            LogSessionId a = nd1.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a.equals(logSessionId);
            if (!equals) {
                C5746dA0.a(C5503cA0.a(C9542sf.g(C5261bA0.a(mediaDrm, bArr))), a);
            }
        }
    }

    public C5988eA0(UUID uuid) throws UnsupportedSchemeException {
        C9542sf.g(uuid);
        C9542sf.b(!C10323vs.e2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.g = uuid;
        MediaDrm mediaDrm = new MediaDrm(F(uuid));
        this.h = mediaDrm;
        this.i = 1;
        if (C10323vs.g2.equals(uuid) && K()) {
            H(mediaDrm);
        }
    }

    public static byte[] A(byte[] bArr) {
        int indexOf;
        C3012Fy1 c3012Fy1 = new C3012Fy1(bArr);
        int w = c3012Fy1.w();
        short z = c3012Fy1.z();
        short z2 = c3012Fy1.z();
        if (z == 1 && z2 == 1) {
            short z3 = c3012Fy1.z();
            Charset charset = KB.e;
            String J = c3012Fy1.J(z3, charset);
            if (J.contains("<LA_URL>")) {
                return bArr;
            }
            if (J.indexOf("</DATA>") == -1) {
                I31.n(j, "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = J.substring(0, indexOf) + n + J.substring(indexOf);
            int i = w + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i);
            allocate.putShort(z);
            allocate.putShort(z2);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        I31.h(j, "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    public static String B(String str) {
        if (n.equals(str)) {
            return "";
        }
        if (TD2.a == 33 && "https://default.url".equals(str)) {
            return "";
        }
        return str;
    }

    public static byte[] C(UUID uuid, byte[] bArr) {
        if (C10323vs.f2.equals(uuid)) {
            return C10654xD.a(bArr);
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] D(UUID uuid, byte[] bArr) {
        UUID uuid2 = C10323vs.h2;
        if (uuid2.equals(uuid)) {
            byte[] e = DK1.e(bArr, uuid);
            if (e != null) {
                bArr = e;
            }
            bArr = DK1.a(uuid2, A(bArr));
        }
        if (TD2.a >= 23 || !C10323vs.g2.equals(uuid)) {
            if (uuid2.equals(uuid) && "Amazon".equals(TD2.c)) {
                String str = TD2.d;
                if (!"AFTB".equals(str)) {
                    if (!"AFTS".equals(str)) {
                        if (!"AFTM".equals(str)) {
                        }
                    }
                }
            }
            return bArr;
        }
        byte[] e2 = DK1.e(bArr, uuid);
        if (e2 != null) {
            return e2;
        }
        return bArr;
    }

    public static String E(UUID uuid, String str) {
        if (TD2.a < 26 && C10323vs.f2.equals(uuid) && (C4128Rj1.f.equals(str) || C4128Rj1.E.equals(str))) {
            return "cenc";
        }
        return str;
    }

    public static UUID F(UUID uuid) {
        if (TD2.a < 27 && C10323vs.f2.equals(uuid)) {
            return C10323vs.e2;
        }
        return uuid;
    }

    public static void H(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static C6960i70.b I(UUID uuid, List<C6960i70.b> list) {
        if (!C10323vs.g2.equals(uuid)) {
            return list.get(0);
        }
        if (TD2.a >= 28 && list.size() > 1) {
            C6960i70.b bVar = list.get(0);
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                C6960i70.b bVar2 = list.get(i2);
                byte[] bArr = (byte[]) C9542sf.g(bVar2.Z0);
                if (TD2.g(bVar2.Y0, bVar.Y0) && TD2.g(bVar2.Z, bVar.Z) && DK1.c(bArr)) {
                    i += bArr.length;
                }
            }
            byte[] bArr2 = new byte[i];
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                byte[] bArr3 = (byte[]) C9542sf.g(list.get(i4).Z0);
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i3, length);
                i3 += length;
            }
            return bVar.b(bArr2);
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            C6960i70.b bVar3 = list.get(i5);
            int g = DK1.g((byte[]) C9542sf.g(bVar3.Z0));
            int i6 = TD2.a;
            if ((i6 < 23 && g == 0) || (i6 >= 23 && g == 1)) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    public static boolean J(UUID uuid) {
        return MediaDrm.isCryptoSchemeSupported(F(uuid));
    }

    public static boolean K() {
        return "ASUS_Z00AD".equals(TD2.d);
    }

    public static C5988eA0 L(UUID uuid) throws C5513cC2 {
        try {
            return new C5988eA0(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new C5513cC2(1, e);
        } catch (Exception e2) {
            throw new C5513cC2(2, e2);
        }
    }

    public static /* synthetic */ InterfaceC3628Mg0 w(UUID uuid) {
        try {
            return L(uuid);
        } catch (C5513cC2 unused) {
            I31.d(j, "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + UE.h);
            return new U70();
        }
    }

    public static /* synthetic */ void x(C5988eA0 c5988eA0, InterfaceC3628Mg0.f fVar, MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
        c5988eA0.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it.next();
            arrayList.add(new InterfaceC3628Mg0.c(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        fVar.a(c5988eA0, bArr, arrayList, z);
    }

    public static /* synthetic */ void y(C5988eA0 c5988eA0, InterfaceC3628Mg0.d dVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        c5988eA0.getClass();
        dVar.a(c5988eA0, bArr, i, i2, bArr2);
    }

    public static /* synthetic */ void z(C5988eA0 c5988eA0, InterfaceC3628Mg0.e eVar, MediaDrm mediaDrm, byte[] bArr, long j2) {
        c5988eA0.getClass();
        eVar.a(c5988eA0, bArr, j2);
    }

    @Override // o.InterfaceC3628Mg0
    /* renamed from: G */
    public C4479Uz0 p(byte[] bArr) throws MediaCryptoException {
        boolean z;
        if (TD2.a < 21 && C10323vs.g2.equals(this.g) && "L3".equals(o("securityLevel"))) {
            z = true;
        } else {
            z = false;
        }
        return new C4479Uz0(F(this.g), bArr, z);
    }

    @Override // o.InterfaceC3628Mg0
    public synchronized void a() {
        boolean z;
        if (this.i > 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        this.i++;
    }

    @Override // o.InterfaceC3628Mg0
    @InterfaceC11300zs1
    public PersistableBundle b() {
        if (TD2.a < 28) {
            return null;
        }
        return C4576Vz0.a(this.h);
    }

    @Override // o.InterfaceC3628Mg0
    public void c(@InterfaceC11300zs1 final InterfaceC3628Mg0.d dVar) {
        MediaDrm.OnEventListener onEventListener;
        MediaDrm mediaDrm = this.h;
        if (dVar == null) {
            onEventListener = null;
        } else {
            onEventListener = new MediaDrm.OnEventListener() { // from class: o.Zz0
                @Override // android.media.MediaDrm.OnEventListener
                public final void onEvent(MediaDrm mediaDrm2, byte[] bArr, int i, int i2, byte[] bArr2) {
                    C5988eA0.y(C5988eA0.this, dVar, mediaDrm2, bArr, i, i2, bArr2);
                }
            };
        }
        mediaDrm.setOnEventListener(onEventListener);
    }

    @Override // o.InterfaceC3628Mg0
    public Map<String, String> d(byte[] bArr) {
        return this.h.queryKeyStatus(bArr);
    }

    @Override // o.InterfaceC3628Mg0
    @ES1(23)
    public void e(@InterfaceC11300zs1 final InterfaceC3628Mg0.e eVar) {
        MediaDrm.OnExpirationUpdateListener onExpirationUpdateListener;
        if (TD2.a >= 23) {
            MediaDrm mediaDrm = this.h;
            if (eVar == null) {
                onExpirationUpdateListener = null;
            } else {
                onExpirationUpdateListener = new MediaDrm.OnExpirationUpdateListener() { // from class: o.Yz0
                    @Override // android.media.MediaDrm.OnExpirationUpdateListener
                    public final void onExpirationUpdate(MediaDrm mediaDrm2, byte[] bArr, long j2) {
                        C5988eA0.z(C5988eA0.this, eVar, mediaDrm2, bArr, j2);
                    }
                };
            }
            mediaDrm.setOnExpirationUpdateListener(onExpirationUpdateListener, (Handler) null);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC3628Mg0
    @ES1(23)
    public void f(@InterfaceC11300zs1 final InterfaceC3628Mg0.f fVar) {
        MediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener;
        if (TD2.a >= 23) {
            MediaDrm mediaDrm = this.h;
            if (fVar == null) {
                onKeyStatusChangeListener = null;
            } else {
                onKeyStatusChangeListener = new MediaDrm.OnKeyStatusChangeListener() { // from class: o.Wz0
                    @Override // android.media.MediaDrm.OnKeyStatusChangeListener
                    public final void onKeyStatusChange(MediaDrm mediaDrm2, byte[] bArr, List list, boolean z) {
                        C5988eA0.x(C5988eA0.this, fVar, mediaDrm2, bArr, list, z);
                    }
                };
            }
            mediaDrm.setOnKeyStatusChangeListener(onKeyStatusChangeListener, (Handler) null);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC3628Mg0
    public synchronized void g() {
        int i = this.i - 1;
        this.i = i;
        if (i == 0) {
            this.h.release();
        }
    }

    @Override // o.InterfaceC3628Mg0
    public InterfaceC3628Mg0.h h() {
        MediaDrm.ProvisionRequest provisionRequest = this.h.getProvisionRequest();
        return new InterfaceC3628Mg0.h(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // o.InterfaceC3628Mg0
    public byte[] i() throws MediaDrmException {
        return this.h.openSession();
    }

    @Override // o.InterfaceC3628Mg0
    public void j(byte[] bArr, byte[] bArr2) {
        this.h.restoreKeys(bArr, bArr2);
    }

    @Override // o.InterfaceC3628Mg0
    public void k(String str, String str2) {
        this.h.setPropertyString(str, str2);
    }

    @Override // o.InterfaceC3628Mg0
    public void l(byte[] bArr) throws DeniedByServerException {
        this.h.provideProvisionResponse(bArr);
    }

    @Override // o.InterfaceC3628Mg0
    public int m() {
        return 2;
    }

    @Override // o.InterfaceC3628Mg0
    public void n(String str, byte[] bArr) {
        this.h.setPropertyByteArray(str, bArr);
    }

    @Override // o.InterfaceC3628Mg0
    public String o(String str) {
        return this.h.getPropertyString(str);
    }

    @Override // o.InterfaceC3628Mg0
    public void q(byte[] bArr, ND1 nd1) {
        if (TD2.a >= 31) {
            try {
                a.b(this.h, bArr, nd1);
            } catch (UnsupportedOperationException unused) {
                I31.n(j, "setLogSessionId failed.");
            }
        }
    }

    @Override // o.InterfaceC3628Mg0
    public boolean r(byte[] bArr, String str) {
        if (TD2.a >= 31) {
            return a.a(this.h, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.g, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // o.InterfaceC3628Mg0
    public void s(byte[] bArr) {
        this.h.closeSession(bArr);
    }

    @Override // o.InterfaceC3628Mg0
    public byte[] t(String str) {
        return this.h.getPropertyByteArray(str);
    }

    @Override // o.InterfaceC3628Mg0
    @InterfaceC11300zs1
    public byte[] u(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (C10323vs.f2.equals(this.g)) {
            bArr2 = C10654xD.b(bArr2);
        }
        return this.h.provideKeyResponse(bArr, bArr2);
    }

    @Override // o.InterfaceC3628Mg0
    @SuppressLint({"WrongConstant"})
    public InterfaceC3628Mg0.b v(byte[] bArr, @InterfaceC11300zs1 List<C6960i70.b> list, int i, @InterfaceC11300zs1 HashMap<String, String> hashMap) throws NotProvisionedException {
        C6960i70.b bVar;
        byte[] bArr2;
        String str;
        int i2;
        if (list != null) {
            bVar = I(this.g, list);
            bArr2 = D(this.g, (byte[]) C9542sf.g(bVar.Z0));
            str = E(this.g, bVar.Y0);
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.h.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] C = C(this.g, keyRequest.getData());
        String B = B(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(B) && bVar != null && !TextUtils.isEmpty(bVar.Z)) {
            B = bVar.Z;
        }
        if (TD2.a >= 23) {
            i2 = keyRequest.getRequestType();
        } else {
            i2 = Integer.MIN_VALUE;
        }
        return new InterfaceC3628Mg0.b(C, B, i2);
    }
}
