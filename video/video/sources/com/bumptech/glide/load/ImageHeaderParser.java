package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.InterfaceC2727De;

/* loaded from: classes.dex */
public interface ImageHeaderParser {
    public static final int a = -1;

    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);
        
        public final boolean X;

        ImageType(boolean z) {
            this.X = z;
        }

        public boolean hasAlpha() {
            return this.X;
        }

        public boolean isWebp() {
            int i = a.a[ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageType.values().length];
            a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    boolean a(ByteBuffer byteBuffer, InterfaceC2727De interfaceC2727De) throws IOException;

    int b(ByteBuffer byteBuffer, InterfaceC2727De interfaceC2727De) throws IOException;

    ImageType c(ByteBuffer byteBuffer) throws IOException;

    int d(InputStream inputStream, InterfaceC2727De interfaceC2727De) throws IOException;

    ImageType e(InputStream inputStream) throws IOException;

    boolean f(InputStream inputStream, InterfaceC2727De interfaceC2727De) throws IOException;
}
