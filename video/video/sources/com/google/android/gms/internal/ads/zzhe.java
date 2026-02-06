package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import o.AD1;
import o.C10977yY;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzhe extends zzfz {
    public final Context e;
    @InterfaceC11300zs1
    public zzgl f;
    @InterfaceC11300zs1
    public AssetFileDescriptor g;
    @InterfaceC11300zs1
    public InputStream h;
    public long i;
    public boolean j;

    public zzhe(Context context) {
        super(false);
        this.e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri k(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    public static int l(String str) throws zzhd {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzhd("Resource identifier must be an integer.", null, 1004);
        }
    }

    public static AssetFileDescriptor m(Context context, zzgl zzglVar) throws zzhd {
        String host;
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = zzglVar.a.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                identifier = l(pathSegments.get(0));
            } else {
                int size = pathSegments.size();
                throw new zzhd("rawresource:// URI must have exactly one path element, found " + size);
            }
        } else if (TextUtils.equals(C10977yY.t, normalizeScheme.getScheme())) {
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith(RemoteSettings.i)) {
                path = path.substring(1);
            }
            if (TextUtils.isEmpty(normalizeScheme.getHost())) {
                host = context.getPackageName();
            } else {
                host = normalizeScheme.getHost();
            }
            if (host.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(host);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new zzhd("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, AD1.h1);
                }
            }
            if (path.matches("\\d+")) {
                identifier = l(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(host + ":" + path, "raw", null);
                if (identifier == 0) {
                    throw new zzhd("Resource not found.", null, AD1.h1);
                }
            }
        } else {
            String scheme = normalizeScheme.getScheme();
            throw new zzhd("Unsupported URI scheme (" + scheme + "). Only android.resource is supported.", null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new zzhd("Resource is compressed: ".concat(String.valueOf(normalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e2) {
            throw new zzhd(null, e2, AD1.h1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) throws zzhd {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzhd(null, e, 2000);
            }
        }
        InputStream inputStream = this.h;
        String str = zzeu.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.i == -1) {
                return -1;
            }
            throw new zzhd("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - read;
        }
        A(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long a(zzgl zzglVar) throws zzhd {
        long j;
        long min;
        this.f = zzglVar;
        h(zzglVar);
        AssetFileDescriptor m = m(this.e, zzglVar);
        this.g = m;
        long length = m.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.g.getFileDescriptor());
        this.h = fileInputStream;
        int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i != 0) {
            try {
                if (zzglVar.e > length) {
                    throw new zzhd(null, null, 2008);
                }
            } catch (zzhd e) {
                throw e;
            } catch (IOException e2) {
                throw new zzhd(null, e2, 2000);
            }
        }
        long startOffset = this.g.getStartOffset();
        long j2 = zzglVar.e;
        long skip = fileInputStream.skip(startOffset + j2) - startOffset;
        if (skip == j2) {
            if (i == 0) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.i = -1L;
                    j = -1;
                } else {
                    j = channel.size() - channel.position();
                    this.i = j;
                    if (j < 0) {
                        throw new zzhd(null, null, 2008);
                    }
                }
            } else {
                j = length - skip;
                this.i = j;
                if (j < 0) {
                    throw new zzgh(2008);
                }
            }
            long j3 = zzglVar.f;
            int i2 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
            if (i2 != 0) {
                if (j == -1) {
                    min = j3;
                } else {
                    min = Math.min(j, j3);
                }
                this.i = min;
            }
            this.j = true;
            i(zzglVar);
            if (i2 != 0) {
                return j3;
            }
            return this.i;
        }
        throw new zzhd(null, null, 2008);
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @InterfaceC11300zs1
    public final Uri c() {
        zzgl zzglVar = this.f;
        if (zzglVar != null) {
            return zzglVar.a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void f() throws zzhd {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.h;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor = this.g;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                } catch (IOException e) {
                    throw new zzhd(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new zzhd(null, e2, 2000);
            }
        } finally {
            this.g = null;
            if (this.j) {
                this.j = false;
                g();
            }
        }
    }
}
