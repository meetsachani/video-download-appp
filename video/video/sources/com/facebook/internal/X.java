package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.facebook.C2412v;
import com.facebook.C2416z;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import o.C6562gT0;
import o.C6652gr0;
import o.C9545sf2;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class X {
    @NotNull
    public static final X a = new X();
    public static final String b = X.class.getName();
    @NotNull
    public static final String c = "com.facebook.NativeAppCallAttachmentStore.files";
    @Nullable
    public static File d;

    /* loaded from: classes2.dex */
    public static final class a {
        @NotNull
        public final UUID a;
        @Nullable
        public final Bitmap b;
        @Nullable
        public final Uri c;
        @NotNull
        public final String d;
        @Nullable
        public final String e;
        public boolean f;
        public boolean g;

        public a(@NotNull UUID uuid, @Nullable Bitmap bitmap, @Nullable Uri uri) {
            String a;
            C6562gT0.p(uuid, "callId");
            this.a = uuid;
            this.b = bitmap;
            this.c = uri;
            boolean z = true;
            if (uri != null) {
                String scheme = uri.getScheme();
                if (C9545sf2.c2("content", scheme, true)) {
                    this.f = true;
                    String authority = uri.getAuthority();
                    this.g = (authority == null || C9545sf2.J2(authority, "media", false, 2, null)) ? false : z;
                } else if (C9545sf2.c2("file", uri.getScheme(), true)) {
                    this.g = true;
                } else {
                    l0 l0Var = l0.a;
                    if (!l0.h0(uri)) {
                        throw new C2416z(C6562gT0.C("Unsupported scheme for media Uri : ", scheme));
                    }
                }
            } else if (bitmap != null) {
                this.g = true;
            } else {
                throw new C2416z("Cannot share media without a bitmap or Uri set");
            }
            String uuid2 = this.g ? UUID.randomUUID().toString() : null;
            this.e = uuid2;
            if (!this.g) {
                a = String.valueOf(uri);
            } else {
                C2412v.a aVar = C2412v.X;
                com.facebook.M m = com.facebook.M.a;
                a = aVar.a(com.facebook.M.o(), uuid, uuid2);
            }
            this.d = a;
        }

        @Nullable
        public final String a() {
            return this.e;
        }

        @NotNull
        public final String b() {
            return this.d;
        }

        @Nullable
        public final Bitmap c() {
            return this.b;
        }

        @NotNull
        public final UUID d() {
            return this.a;
        }

        @Nullable
        public final Uri e() {
            return this.c;
        }

        public final boolean f() {
            return this.g;
        }

        public final boolean g() {
            return this.f;
        }

        public final void h(boolean z) {
            this.f = z;
        }

        public final void i(boolean z) {
            this.g = z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    @InterfaceC9511sW0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@Nullable Collection<a> collection) throws C2416z {
        File g;
        if (collection != null && !collection.isEmpty()) {
            if (d == null) {
                b();
            }
            f();
            ArrayList<File> arrayList = new ArrayList();
            try {
                for (a aVar : collection) {
                    if (aVar.f() && (g = g(aVar.d(), aVar.a(), true)) != null) {
                        arrayList.add(g);
                        if (aVar.c() != null) {
                            a.k(aVar.c(), g);
                        } else if (aVar.e() != null) {
                            a.l(aVar.e(), aVar.g(), g);
                        }
                    }
                }
            } catch (IOException e) {
                Log.e(b, C6562gT0.C("Got unexpected exception:", e));
                for (File file : arrayList) {
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                    }
                    while (r0.hasNext()) {
                    }
                }
                throw new C2416z(e);
            }
        }
    }

    @InterfaceC9511sW0
    public static final void b() {
        File h = h();
        if (h == null) {
            return;
        }
        C6652gr0.c0(h);
    }

    @InterfaceC9511sW0
    public static final void c(@NotNull UUID uuid) {
        C6562gT0.p(uuid, "callId");
        File i = i(uuid, false);
        if (i == null) {
            return;
        }
        C6652gr0.c0(i);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final a d(@NotNull UUID uuid, @NotNull Bitmap bitmap) {
        C6562gT0.p(uuid, "callId");
        C6562gT0.p(bitmap, "attachmentBitmap");
        return new a(uuid, bitmap, null);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final a e(@NotNull UUID uuid, @NotNull Uri uri) {
        C6562gT0.p(uuid, "callId");
        C6562gT0.p(uri, "attachmentUri");
        return new a(uuid, null, uri);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final File f() {
        File h = h();
        if (h == null) {
            return h;
        }
        h.mkdirs();
        return h;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final File g(@NotNull UUID uuid, @Nullable String str, boolean z) throws IOException {
        C6562gT0.p(uuid, "callId");
        File i = i(uuid, z);
        if (i == null) {
            return null;
        }
        try {
            return new File(i, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final synchronized File h() {
        File file;
        synchronized (X.class) {
            try {
                if (d == null) {
                    com.facebook.M m = com.facebook.M.a;
                    d = new File(com.facebook.M.n().getCacheDir(), c);
                }
                file = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final File i(@NotNull UUID uuid, boolean z) {
        C6562gT0.p(uuid, "callId");
        if (d == null) {
            return null;
        }
        File file = new File(d, uuid.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final File j(@Nullable UUID uuid, @Nullable String str) throws FileNotFoundException {
        l0 l0Var = l0.a;
        if (!l0.f0(str) && uuid != null) {
            try {
                return g(uuid, str, false);
            } catch (IOException unused) {
                throw new FileNotFoundException();
            }
        }
        throw new FileNotFoundException();
    }

    public final void k(Bitmap bitmap, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            l0 l0Var = l0.a;
            l0.j(fileOutputStream);
        }
    }

    public final void l(Uri uri, boolean z, File file) throws IOException {
        InputStream openInputStream;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            if (!z) {
                openInputStream = new FileInputStream(uri.getPath());
            } else {
                com.facebook.M m = com.facebook.M.a;
                openInputStream = com.facebook.M.n().getContentResolver().openInputStream(uri);
            }
            l0 l0Var = l0.a;
            l0.q(openInputStream, fileOutputStream);
            l0.j(fileOutputStream);
        } catch (Throwable th) {
            l0 l0Var2 = l0.a;
            l0.j(fileOutputStream);
            throw th;
        }
    }
}
