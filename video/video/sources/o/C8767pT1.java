package o;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import o.InterfaceC7595kk1;

/* renamed from: o.pT1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8767pT1<Data> implements InterfaceC7595kk1<Integer, Data> {
    public static final String c = "ResourceLoader";
    public final InterfaceC7595kk1<Uri, Data> a;
    public final Resources b;

    public C8767pT1(Resources resources, InterfaceC7595kk1<Uri, Data> interfaceC7595kk1) {
        this.b = resources;
        this.a = interfaceC7595kk1;
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: c */
    public InterfaceC7595kk1.a<Data> b(Integer num, int i, int i2, C5448bw1 c5448bw1) {
        Uri d2 = d(num);
        if (d2 == null) {
            return null;
        }
        return this.a.b(d2, i, i2, c5448bw1);
    }

    public final Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.b.getResourcePackageName(num.intValue()) + '/' + num);
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable(c, 5)) {
                Log.w(c, "Received invalid resource id: " + num, e);
                return null;
            }
            return null;
        }
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: e */
    public boolean a(Integer num) {
        return true;
    }

    /* renamed from: o.pT1$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC7838lk1<Integer, AssetFileDescriptor> {
        public final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Integer, AssetFileDescriptor> e(C5650cm1 c5650cm1) {
            return new C8767pT1(this.a, c5650cm1.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }

    @Deprecated
    /* renamed from: o.pT1$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC7838lk1<Integer, ParcelFileDescriptor> {
        public final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Integer, ParcelFileDescriptor> e(C5650cm1 c5650cm1) {
            return new C8767pT1(this.a, c5650cm1.d(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }

    /* renamed from: o.pT1$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC7838lk1<Integer, InputStream> {
        public final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Integer, InputStream> e(C5650cm1 c5650cm1) {
            return new C8767pT1(this.a, c5650cm1.d(Uri.class, InputStream.class));
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }

    /* renamed from: o.pT1$d */
    /* loaded from: classes.dex */
    public static class d implements InterfaceC7838lk1<Integer, Uri> {
        public final Resources a;

        public d(Resources resources) {
            this.a = resources;
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Integer, Uri> e(C5650cm1 c5650cm1) {
            return new C8767pT1(this.a, C8205nA2.c());
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }
}
