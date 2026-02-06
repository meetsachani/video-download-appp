package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements com.bumptech.glide.load.data.a<ParcelFileDescriptor> {
    public final InternalRewinder a;

    /* loaded from: classes.dex */
    public static final class InternalRewinder {
        public final ParcelFileDescriptor a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0063a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0063a
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0063a
        /* renamed from: c */
        public com.bumptech.glide.load.data.a<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean a() {
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.data.a
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.a
    /* renamed from: d */
    public ParcelFileDescriptor c() throws IOException {
        return this.a.rewind();
    }
}
