package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.InterfaceC7595kk1;

/* loaded from: classes.dex */
public class OC2<Data> implements InterfaceC7595kk1<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", C10977yY.t)));
    public final c<Data> a;

    /* loaded from: classes.dex */
    public static final class a implements InterfaceC7838lk1<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        public final ContentResolver a;
        public final boolean b;

        public a(ContentResolver contentResolver) {
            this(contentResolver, false);
        }

        @Override // o.OC2.c
        public InterfaceC9990uU<AssetFileDescriptor> a(Uri uri) {
            return new C10271vf(this.a, uri, this.b);
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Uri, AssetFileDescriptor> e(C5650cm1 c5650cm1) {
            return new OC2(this);
        }

        public a(ContentResolver contentResolver, boolean z) {
            this.a = contentResolver;
            this.b = z;
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }

    /* loaded from: classes.dex */
    public static class b implements InterfaceC7838lk1<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        public final ContentResolver a;
        public final boolean b;

        public b(ContentResolver contentResolver) {
            this(contentResolver, false);
        }

        @Override // o.OC2.c
        public InterfaceC9990uU<ParcelFileDescriptor> a(Uri uri) {
            return new C5661cp0(this.a, uri, this.b);
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Uri, ParcelFileDescriptor> e(C5650cm1 c5650cm1) {
            return new OC2(this);
        }

        public b(ContentResolver contentResolver, boolean z) {
            this.a = contentResolver;
            this.b = z;
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }

    /* loaded from: classes.dex */
    public interface c<Data> {
        InterfaceC9990uU<Data> a(Uri uri);
    }

    /* loaded from: classes.dex */
    public static class d implements InterfaceC7838lk1<Uri, InputStream>, c<InputStream> {
        public final ContentResolver a;
        public final boolean b;

        public d(ContentResolver contentResolver) {
            this(contentResolver, false);
        }

        @Override // o.OC2.c
        public InterfaceC9990uU<InputStream> a(Uri uri) {
            return new C3227Id2(this.a, uri, this.b);
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Uri, InputStream> e(C5650cm1 c5650cm1) {
            return new OC2(this);
        }

        public d(ContentResolver contentResolver, boolean z) {
            this.a = contentResolver;
            this.b = z;
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }

    public OC2(c<Data> cVar) {
        this.a = cVar;
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: c */
    public InterfaceC7595kk1.a<Data> b(Uri uri, int i, int i2, C5448bw1 c5448bw1) {
        return new InterfaceC7595kk1.a<>(new C7874lt1(uri), this.a.a(uri));
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: d */
    public boolean a(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
