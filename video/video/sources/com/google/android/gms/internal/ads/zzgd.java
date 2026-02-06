package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;
import o.AD1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzgd extends zzfz {
    public final ContentResolver e;
    @InterfaceC11300zs1
    public Uri f;
    @InterfaceC11300zs1
    public AssetFileDescriptor g;
    @InterfaceC11300zs1
    public FileInputStream h;
    public long i;
    public boolean j;

    public zzgd(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) throws zzgc {
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
                throw new zzgc(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.h;
        String str = zzeu.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - read;
        }
        A(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long a(zzgl zzglVar) throws zzgc {
        int i;
        int i2;
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        long min;
        try {
            try {
                Uri normalizeScheme = zzglVar.a.normalizeScheme();
                this.f = normalizeScheme;
                h(zzglVar);
                if (Objects.equals(normalizeScheme.getScheme(), "content")) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.e.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.e.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.g = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.h = fileInputStream;
                    int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                    if (i3 != 0 && zzglVar.e > length) {
                        throw new zzgc(null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long j2 = zzglVar.e;
                    long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                    if (skip == j2) {
                        if (i3 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.i = -1L;
                                j = -1;
                            } else {
                                j = size - channel.position();
                                this.i = j;
                                if (j < 0) {
                                    throw new zzgc(null, 2008);
                                }
                            }
                        } else {
                            j = length - skip;
                            this.i = j;
                            if (j < 0) {
                                throw new zzgc(null, 2008);
                            }
                        }
                        long j3 = zzglVar.f;
                        int i4 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
                        if (i4 != 0) {
                            if (j == -1) {
                                min = j3;
                            } else {
                                min = Math.min(j, j3);
                            }
                            this.i = min;
                        }
                        this.j = true;
                        i(zzglVar);
                        if (i4 != 0) {
                            return j3;
                        }
                        return this.i;
                    }
                    throw new zzgc(null, 2008);
                }
                i = 2000;
                try {
                    throw new zzgc(new IOException("Could not open file descriptor for: " + String.valueOf(normalizeScheme)), 2000);
                } catch (IOException e) {
                    e = e;
                    if (true != (e instanceof FileNotFoundException)) {
                        i2 = i;
                    } else {
                        i2 = AD1.h1;
                    }
                    throw new zzgc(e, i2);
                }
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (zzgc e3) {
            throw e3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @InterfaceC11300zs1
    public final Uri c() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void f() throws zzgc {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor = this.g;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                } catch (IOException e) {
                    throw new zzgc(e, 2000);
                }
            } catch (IOException e2) {
                throw new zzgc(e2, 2000);
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
