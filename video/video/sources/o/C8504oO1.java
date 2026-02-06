package o;

import android.content.Context;
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

@Deprecated
/* renamed from: o.oO1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8504oO1 extends AbstractC5887dl {
    public static final String m = "rawresource";
    public final Resources f;
    public final String g;
    @InterfaceC11300zs1
    public Uri h;
    @InterfaceC11300zs1
    public AssetFileDescriptor i;
    @InterfaceC11300zs1
    public InputStream j;
    public long k;
    public boolean l;

    /* renamed from: o.oO1$a */
    /* loaded from: classes2.dex */
    public static class a extends LU {
        @Deprecated
        public a(String str) {
            super(str, null, 2000);
        }

        @Deprecated
        public a(Throwable th) {
            super(th, 2000);
        }

        public a(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 Throwable th, int i) {
            super(str, th, i);
        }
    }

    public C8504oO1(Context context) {
        super(false);
        this.f = context.getResources();
        this.g = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // o.FU
    public long a(OU ou) throws a {
        int parseInt;
        String str;
        Uri normalizeScheme = ou.a.normalizeScheme();
        this.h = normalizeScheme;
        if (!TextUtils.equals("rawresource", normalizeScheme.getScheme()) && (!TextUtils.equals(C10977yY.t, normalizeScheme.getScheme()) || normalizeScheme.getPathSegments().size() != 1 || !((String) C9542sf.g(normalizeScheme.getLastPathSegment())).matches("\\d+"))) {
            if (TextUtils.equals(C10977yY.t, normalizeScheme.getScheme())) {
                String str2 = (String) C9542sf.g(normalizeScheme.getPath());
                if (str2.startsWith(RemoteSettings.i)) {
                    str2 = str2.substring(1);
                }
                String host = normalizeScheme.getHost();
                StringBuilder sb = new StringBuilder();
                if (TextUtils.isEmpty(host)) {
                    str = "";
                } else {
                    str = host + ":";
                }
                sb.append(str);
                sb.append(str2);
                parseInt = this.f.getIdentifier(sb.toString(), "raw", this.g);
                if (parseInt == 0) {
                    throw new a("Resource not found.", null, AD1.h1);
                }
            } else {
                throw new a("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only rawresource and " + C10977yY.t + " are supported.", null, 1004);
            }
        } else {
            try {
                parseInt = Integer.parseInt((String) C9542sf.g(normalizeScheme.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        }
        A(ou);
        try {
            AssetFileDescriptor openRawResourceFd = this.f.openRawResourceFd(parseInt);
            this.i = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.j = fileInputStream;
                int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i != 0) {
                    try {
                        if (ou.g > length) {
                            throw new a(null, null, 2008);
                        }
                    } catch (a e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new a(null, e2, 2000);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(ou.g + startOffset) - startOffset;
                if (skip == ou.g) {
                    if (i == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.k = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.k = size;
                            if (size < 0) {
                                throw new a(null, null, 2008);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.k = j;
                        if (j < 0) {
                            throw new LU(2008);
                        }
                    }
                    long j2 = ou.h;
                    if (j2 != -1) {
                        long j3 = this.k;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.k = j2;
                    }
                    this.l = true;
                    B(ou);
                    long j4 = ou.h;
                    if (j4 != -1) {
                        return j4;
                    }
                    return this.k;
                }
                throw new a(null, null, 2008);
            }
            throw new a("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e3) {
            throw new a(null, e3, AD1.h1);
        }
    }

    @Override // o.FU
    public void close() throws a {
        this.h = null;
        try {
            try {
                InputStream inputStream = this.j;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.j = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.i;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new a(null, e, 2000);
                    }
                } finally {
                    this.i = null;
                    if (this.l) {
                        this.l = false;
                        z();
                    }
                }
            } catch (Throwable th) {
                this.j = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.i;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.i = null;
                        if (this.l) {
                            this.l = false;
                            z();
                        }
                        throw th;
                    } finally {
                        this.i = null;
                        if (this.l) {
                            this.l = false;
                            z();
                        }
                    }
                } catch (IOException e2) {
                    throw new a(null, e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new a(null, e3, 2000);
        }
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        return this.h;
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.k;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(null, e, 2000);
            }
        }
        int read = ((InputStream) TD2.o(this.j)).read(bArr, i, i2);
        if (read == -1) {
            if (this.k == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.k;
        if (j2 != -1) {
            this.k = j2 - read;
        }
        y(read);
        return read;
    }
}
