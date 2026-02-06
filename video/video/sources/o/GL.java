package o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

@Deprecated
/* loaded from: classes2.dex */
public final class GL extends AbstractC5887dl {
    public final ContentResolver f;
    @InterfaceC11300zs1
    public Uri g;
    @InterfaceC11300zs1
    public AssetFileDescriptor h;
    @InterfaceC11300zs1
    public FileInputStream i;
    public long j;
    public boolean k;

    /* loaded from: classes2.dex */
    public static class a extends LU {
        @Deprecated
        public a(IOException iOException) {
            this(iOException, 2000);
        }

        public a(@InterfaceC11300zs1 IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public GL(Context context) {
        super(false);
        this.f = context.getContentResolver();
    }

    @Override // o.FU
    public long a(OU ou) throws a {
        AssetFileDescriptor openAssetFileDescriptor;
        int i = 2000;
        try {
            Uri normalizeScheme = ou.a.normalizeScheme();
            this.g = normalizeScheme;
            A(ou);
            if ("content".equals(normalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.h = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.i = fileInputStream;
                int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i2 != 0 && ou.g > length) {
                    throw new a(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(ou.g + startOffset) - startOffset;
                if (skip == ou.g) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.j = -1L;
                        } else {
                            long position = size - channel.position();
                            this.j = position;
                            if (position < 0) {
                                throw new a(null, 2008);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.j = j;
                        if (j < 0) {
                            throw new a(null, 2008);
                        }
                    }
                    long j2 = ou.h;
                    if (j2 != -1) {
                        long j3 = this.j;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.j = j2;
                    }
                    this.k = true;
                    B(ou);
                    long j4 = ou.h;
                    if (j4 != -1) {
                        return j4;
                    }
                    return this.j;
                }
                throw new a(null, 2008);
            }
            throw new a(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
        } catch (a e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = AD1.h1;
            }
            throw new a(e2, i);
        }
    }

    @Override // o.FU
    public void close() throws a {
        this.g = null;
        try {
            try {
                FileInputStream fileInputStream = this.i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new a(e, 2000);
                    }
                } finally {
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        z();
                    }
                }
            } catch (Throwable th) {
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.h = null;
                        if (this.k) {
                            this.k = false;
                            z();
                        }
                        throw th;
                    } finally {
                        this.h = null;
                        if (this.k) {
                            this.k = false;
                            z();
                        }
                    }
                } catch (IOException e2) {
                    throw new a(e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new a(e3, 2000);
        }
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        return this.g;
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(e, 2000);
            }
        }
        int read = ((FileInputStream) TD2.o(this.i)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.j;
        if (j2 != -1) {
            this.j = j2 - read;
        }
        y(read);
        return read;
    }
}
