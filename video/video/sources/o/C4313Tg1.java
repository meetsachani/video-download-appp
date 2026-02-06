package o;

import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.metrics.LogSessionId;

@Deprecated
/* renamed from: o.Tg1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4313Tg1 {
    public static final String a = "android.media.mediaparser.inBandCryptoInfo";
    public static final String b = "android.media.mediaparser.includeSupplementalData";
    public static final String c = "android.media.mediaparser.eagerlyExposeTrackType";
    public static final String d = "android.media.mediaparser.exposeDummySeekMap";
    public static final String e = "android.media.mediaParser.exposeChunkIndexAsMediaFormat";
    public static final String f = "android.media.mediaParser.overrideInBandCaptionDeclarations";
    public static final String g = "android.media.mediaParser.exposeCaptionFormats";
    public static final String h = "android.media.mediaparser.ignoreTimestampOffset";

    @ES1(31)
    /* renamed from: o.Tg1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @K40
        public static void a(MediaParser mediaParser, ND1 nd1) {
            LogSessionId logSessionId;
            boolean equals;
            LogSessionId a = nd1.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a.equals(logSessionId);
            if (!equals) {
                mediaParser.setLogSessionId(a);
            }
        }
    }

    @ES1(31)
    public static void a(MediaParser mediaParser, ND1 nd1) {
        a.a(mediaParser, nd1);
    }

    public static MediaFormat b(C10833xx0 c10833xx0) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", c10833xx0.g1);
        int i = c10833xx0.y1;
        if (i != -1) {
            mediaFormat.setInteger("caption-service-number", i);
        }
        return mediaFormat;
    }
}
