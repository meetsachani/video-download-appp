package o;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import o.C5935dx0;

/* renamed from: o.Ww0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4664Ww0 {
    public static final Y61<d, ProviderInfo> a = new Y61<>(2);
    public static final Comparator<byte[]> b = new Comparator() { // from class: o.Vw0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C4664Ww0.a((byte[]) obj, (byte[]) obj2);
        }
    };

    /* renamed from: o.Ww0$a */
    /* loaded from: classes.dex */
    public interface a {
        static a a(Context context, Uri uri) {
            return new c(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* renamed from: o.Ww0$b */
    /* loaded from: classes.dex */
    public static class b implements a {
        public final ContentProviderClient a;

        public b(Context context, Uri uri) {
            this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // o.C4664Ww0.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e) {
                Log.w("FontsProvider", "Unable to query the content provider", e);
                return null;
            }
        }

        @Override // o.C4664Ww0.a
        public void close() {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    /* renamed from: o.Ww0$c */
    /* loaded from: classes.dex */
    public static class c implements a {
        public final ContentProviderClient a;

        public c(Context context, Uri uri) {
            this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // o.C4664Ww0.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e) {
                Log.w("FontsProvider", "Unable to query the content provider", e);
                return null;
            }
        }

        @Override // o.C4664Ww0.a
        public void close() {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    /* renamed from: o.Ww0$d */
    /* loaded from: classes.dex */
    public static class d {
        public String a;
        public String b;
        public List<List<byte[]>> c;

        public d(String str, String str2, List<List<byte[]>> list) {
            this.a = str;
            this.b = str2;
            this.c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (Objects.equals(this.a, dVar.a) && Objects.equals(this.b, dVar.b) && Objects.equals(this.c, dVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b, this.c);
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            byte b3 = bArr2[i];
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return 0;
    }

    public static void b() {
        a.d();
    }

    public static List<byte[]> c(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean d(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static List<List<byte[]>> e(C4761Xw0 c4761Xw0, Resources resources) {
        if (c4761Xw0.b() != null) {
            return c4761Xw0.b();
        }
        return C5693cx0.c(resources, c4761Xw0.c());
    }

    public static C5935dx0.b f(Context context, List<C4761Xw0> list, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        C6399fr2.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C4761Xw0 c4761Xw0 = list.get(i);
                ProviderInfo g = g(context.getPackageManager(), c4761Xw0, context.getResources());
                if (g == null) {
                    return C5935dx0.b.b(1, null);
                }
                arrayList.add(h(context, c4761Xw0, g.authority, cancellationSignal));
            }
            return C5935dx0.b.a(0, arrayList);
        } finally {
            C6399fr2.f();
        }
    }

    public static ProviderInfo g(PackageManager packageManager, C4761Xw0 c4761Xw0, Resources resources) throws PackageManager.NameNotFoundException {
        C6399fr2.c("FontProvider.getProvider");
        try {
            List<List<byte[]>> e = e(c4761Xw0, resources);
            d dVar = new d(c4761Xw0.f(), c4761Xw0.g(), e);
            ProviderInfo f = a.f(dVar);
            if (f != null) {
                return f;
            }
            String f2 = c4761Xw0.f();
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(f2, 0);
            if (resolveContentProvider != null) {
                if (resolveContentProvider.packageName.equals(c4761Xw0.g())) {
                    List<byte[]> c2 = c(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                    Collections.sort(c2, b);
                    for (int i = 0; i < e.size(); i++) {
                        ArrayList arrayList = new ArrayList(e.get(i));
                        Collections.sort(arrayList, b);
                        if (d(c2, arrayList)) {
                            a.j(dVar, resolveContentProvider);
                            return resolveContentProvider;
                        }
                    }
                    C6399fr2.f();
                    return null;
                }
                throw new PackageManager.NameNotFoundException("Found content provider " + f2 + ", but package was not " + c4761Xw0.g());
            }
            throw new PackageManager.NameNotFoundException("No package found for authority: " + f2);
        } finally {
            C6399fr2.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2, types: [o.Ww0$a] */
    public static C5935dx0.c[] h(Context context, C4761Xw0 c4761Xw0, String str, CancellationSignal cancellationSignal) {
        ?? r16;
        a aVar;
        int i;
        int i2;
        a aVar2;
        Uri withAppendedId;
        int i3;
        boolean z;
        C6399fr2.c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            a a2 = a.a(context, build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", C5935dx0.a.a, C5935dx0.a.b, C5935dx0.a.c, C5935dx0.a.d, C5935dx0.a.e, C5935dx0.a.f};
                C6399fr2.c("ContentQueryWrapper.query");
                try {
                    Cursor b2 = a2.b(build, strArr, "query = ?", new String[]{c4761Xw0.h()}, null, cancellationSignal);
                    if (b2 != null && b2.getCount() > 0) {
                        int columnIndex = b2.getColumnIndex(C5935dx0.a.f);
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = b2.getColumnIndex("_id");
                        int columnIndex3 = b2.getColumnIndex(C5935dx0.a.a);
                        int columnIndex4 = b2.getColumnIndex(C5935dx0.a.b);
                        int columnIndex5 = b2.getColumnIndex(C5935dx0.a.d);
                        int columnIndex6 = b2.getColumnIndex(C5935dx0.a.e);
                        while (b2.moveToNext()) {
                            if (columnIndex != -1) {
                                i = b2.getInt(columnIndex);
                            } else {
                                i = 0;
                            }
                            if (columnIndex4 != -1) {
                                i2 = b2.getInt(columnIndex4);
                            } else {
                                i2 = 0;
                            }
                            if (columnIndex3 == -1) {
                                context = a2;
                                withAppendedId = ContentUris.withAppendedId(build, b2.getLong(columnIndex2));
                                aVar2 = context;
                            } else {
                                aVar2 = a2;
                                withAppendedId = ContentUris.withAppendedId(build2, b2.getLong(columnIndex3));
                            }
                            if (columnIndex5 != -1) {
                                i3 = b2.getInt(columnIndex5);
                            } else {
                                i3 = 400;
                            }
                            if (columnIndex6 != -1) {
                                z = true;
                                if (b2.getInt(columnIndex6) == 1) {
                                    arrayList2.add(C5935dx0.c.a(withAppendedId, i2, i3, z, i));
                                    a2 = aVar2;
                                }
                            }
                            z = false;
                            arrayList2.add(C5935dx0.c.a(withAppendedId, i2, i3, z, i));
                            a2 = aVar2;
                        }
                        aVar = a2;
                        arrayList = arrayList2;
                    } else {
                        aVar = a2;
                    }
                    if (b2 != null) {
                        b2.close();
                    }
                    aVar.close();
                    return (C5935dx0.c[]) arrayList.toArray(new C5935dx0.c[0]);
                } catch (Throwable th) {
                    th = th;
                    r16 = context;
                    if (0 != 0) {
                        cursor.close();
                    }
                    r16.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r16 = a2;
            }
        } finally {
            C6399fr2.f();
        }
    }
}
