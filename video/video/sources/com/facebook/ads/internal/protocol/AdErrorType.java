package com.facebook.ads.internal.protocol;

import com.facebook.ads.AdError;
import java.util.Arrays;
import o.AD1;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.InterfaceC8148mw2;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public enum AdErrorType {
    UNKNOWN_ERROR(-1, A00(2564, 13, 115), false),
    NETWORK_ERROR(1000, A00(2090, 13, 38), true),
    NO_FILL(1001, A00(2103, 7, 67), true),
    LOAD_TOO_FREQUENTLY(1002, A00(261, 31, 33), true),
    DISABLED_APP(1005, A00(368, 39, 73), true),
    SERVER_ERROR(2000, A00(2209, 12, 118), true),
    INTERNAL_ERROR(2001, A00(1620, 14, 59), true),
    CACHE_FAILURE_ERROR(2002, A00(2124, 19, 114), true),
    START_BEFORE_INIT(AD1.h1, A00(2528, 36, 87), true),
    REMOTE_ADS_SERVICE_ERROR(2008, A00(343, 25, 103), true),
    INTERSTITIAL_AD_TIMEOUT(AdError.INTERSTITIAL_AD_TIMEOUT, A00(2221, 31, 124), true),
    RV_AD_TIMEOUT(2010, A00(2252, 33, 112), true),
    AD_PRESENTATION_ERROR(AdError.AD_PRESENTATION_ERROR_CODE, A00(150, 25, 73), true),
    BROKEN_MEDIA_ERROR(AdError.BROKEN_MEDIA_ERROR_CODE, A00(1020, 34, 110), true),
    AD_REQUEST_FAILED(1111, A00(623, 39, 9), false),
    AD_REQUEST_TIMEOUT(1112, A00(662, 42, 17), false),
    PARSER_FAILURE(1201, A00(1054, 50, 83), false),
    UNKNOWN_RESPONSE(1202, A00(2343, 47, 20), false),
    ERROR_MESSAGE(1203, A00(575, 48, 29), true),
    NO_AD_PLACEMENT(1302, A00(InterfaceC8148mw2.h.n, 42, 7), false),
    MEDIATION_ERROR(3001, A00(1926, 15, 10), true),
    BID_IMPRESSION_MISMATCH(AD1.p1, A00(465, 36, 125), true),
    BID_PAYLOAD_ERROR(AD1.q1, A00(1673, 19, 99), false),
    NO_ADAPTER_ON_LOAD(AD1.u1, A00(292, 25, 62), false),
    NO_ADAPTER_ON_START(AD1.v1, A00(InterfaceC8148mw2.a.r, 26, 114), false),
    INTERSTITIAL_CONTROLLER_IS_NULL(5003, A00(1634, 39, 70), false),
    WEB_VIEW_FAILED_TO_LOAD(5004, A00(2443, 22, 34), false),
    WEB_VIEW_CACHE_FILE_WAS_DENIED(5005, A00(1104, 43, 17), false),
    NO_MEDIAVIEW_IN_NATIVEAD(6001, A00(1894, 32, 70), true),
    NO_MEDIAVIEW_IN_NATIVEBANNERAD(6002, A00(1847, 47, 81), true),
    UNSUPPORTED_AD_ASSET_NATIVEAD(6003, A00(2577, 29, 53), true),
    AD_ALREADY_STARTED(7001, A00(91, 18, 43), true),
    LOAD_CALLED_WHILE_SHOWING_AD(AdError.LOAD_CALLED_WHILE_SHOWING_AD, A00(109, 41, 30), true),
    CLEAR_TEXT_SUPPORT_NOT_ALLOWED(AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED, A00(1277, 343, 52), true),
    INCORRECT_STATE_ERROR(AdError.INCORRECT_STATE_ERROR, A00(2492, 36, 103), true),
    MISSING_DEPENDENCIES_ERROR(AdError.MISSING_DEPENDENCIES_ERROR, A00(746, 178, 72), true),
    API_NOT_SUPPORTED(AdError.API_NOT_SUPPORTED, A00(924, 75, 43), true),
    NATIVE_AD_IS_NOT_LOADED(AdError.NATIVE_AD_IS_NOT_LOADED, A00(175, 86, 93), true),
    INCORRECT_API_CALL_ERROR(7008, A00(2465, 27, 10), true),
    IMAGE_CACHE_ERROR(8001, A00(999, 21, 2), false),
    LOAD_AD_CALLED_MORE_THAN_ONCE(8002, A00(1768, 38, 37), true);
    
    public static byte[] A03;
    public final int A00;
    public final String A01;
    public final boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{C8077mf.B, C8077mf.G, 6, C8077mf.B, C8077mf.y, C8077mf.m, 28, C8077mf.B, C8077mf.G, 0, 6, 10, 13, C8077mf.B, C8077mf.m, 13, 28, C8077mf.G, 72, 77, 86, 89, 91, 76, 90, 76, 71, 93, 72, 93, 64, 70, 71, 86, 76, 91, 91, 70, 91, 106, 111, 116, 121, 110, 122, 126, 110, QC1.w, Byte.MAX_VALUE, 116, 109, 106, 98, 103, 110, 111, 17, C8077mf.x, C8077mf.q, 2, C8077mf.y, 1, 5, C8077mf.y, 3, 4, C8077mf.q, 4, C8077mf.C, C8077mf.G, C8077mf.y, 31, 5, 4, C8077mf.G, C8077mf.n, C8077mf.y, 3, C8077mf.u, 19, 8, 3, C8077mf.q, 9, C8077mf.n, C8077mf.n, 19, C8077mf.p, 8, C8077mf.C, C8077mf.B, C3307Iz.X, 0, 68, 5, 8, C8077mf.z, 1, 5, 0, C8077mf.G, 68, C8077mf.A, C8077mf.r, 5, C8077mf.z, C8077mf.r, 1, 0, C8077mf.r, 53, 113, 50, 48, ED2.a, ED2.a, 62, C3307Iz.X, 113, 51, 52, 113, C4715Xk.i, 62, 48, 53, 52, 53, 113, C3307Iz.Y, 57, 56, C4715Xk.i, 52, 113, 51, 52, 56, ED2.a, 54, 113, 53, 56, 34, C3307Iz.V, C4715Xk.i, 48, 40, 52, 53, 71, 98, C3307Iz.Y, 101, 105, 115, 106, 98, C3307Iz.Y, 104, 105, 114, C3307Iz.Y, 100, 99, C3307Iz.Y, 118, 116, 99, 117, 99, 104, 114, 99, 98, 83, 118, 50, 123, 97, 50, 124, 125, 102, 50, 126, 125, 115, 118, 119, 118, 60, 50, 95, 115, 121, 119, 50, 97, 103, 96, 119, 50, 102, 122, 115, 102, 50, 107, 125, 103, 50, 113, 115, 126, 126, 50, 126, 125, 115, 118, 83, 118, 58, 59, 50, 112, 119, 116, 125, 96, 119, 50, 96, 119, 117, 123, 97, 102, 119, 96, 68, 123, 119, 101, 84, 125, 96, 91, 124, 102, 119, 96, 115, 113, 102, 123, 125, 124, 58, 59, 47, 10, 78, C8077mf.C, C8077mf.q, C8077mf.G, 78, 28, C8077mf.m, 67, 2, 1, C8077mf.q, 10, C8077mf.m, 10, 78, C8077mf.D, 1, 1, 78, 8, 28, C8077mf.m, 31, C8077mf.E, C8077mf.m, 0, C8077mf.D, 2, C8077mf.A, 48, C8077mf.y, C8077mf.r, 1, 5, C8077mf.x, 3, 81, C8077mf.B, 2, 81, 31, 4, C8077mf.G, C8077mf.G, 81, C8077mf.H, 31, C4715Xk.i, C8077mf.H, C8077mf.r, C8077mf.y, 81, 48, C8077mf.y, 124, 89, 92, 77, 73, 88, 79, C8077mf.G, 84, 78, C8077mf.G, 83, 72, 81, 81, C8077mf.G, 82, 83, 110, 73, 92, 79, 73, C8077mf.G, 124, 89, 105, 76, 91, 8, 123, 77, 90, 94, 65, 75, 77, 8, 88, 90, 71, 75, 77, 91, 91, 8, 77, 90, 90, 71, 90, 71, 118, 118, C3307Iz.Y, 111, 117, C3307Iz.Y, 98, 111, 117, 103, 100, 106, 99, 98, C3307Iz.Y, 96, 116, 105, 107, C3307Iz.Y, 107, 103, 109, 111, 104, 97, C3307Iz.Y, 103, 98, C3307Iz.Y, 116, 99, 119, 115, 99, 117, 114, 117, 1, 10, 7, 28, 10, C8077mf.p, 19, 17, 6, C8077mf.r, C8077mf.r, 10, C8077mf.n, 13, 28, C8077mf.p, 10, C8077mf.r, C8077mf.p, 2, C8077mf.A, 0, C8077mf.m, 85, 94, 83, 72, 71, 86, 78, 91, 88, 86, 83, 72, 82, 69, 69, 88, 69, 95, 79, 82, 86, 88, 83, 66, 80, 88, 89, 84, 92, 66, 88, 79, 79, 82, 79, 112, 91, 86, C8077mf.u, 66, 83, 75, 94, 93, 83, 86, C8077mf.u, 86, 93, 87, 65, C8077mf.u, 92, 93, 70, C8077mf.u, 95, 83, 70, 81, 90, C8077mf.u, 66, 94, 83, 81, 87, 95, 87, 92, 70, 8, 10, 8, 3, C8077mf.p, C8077mf.x, 13, 10, 2, 7, C8077mf.H, C8077mf.C, C8077mf.p, C8077mf.x, C8077mf.p, C8077mf.C, C8077mf.C, 4, C8077mf.C, 116, 123, 114, 118, 101, 104, 99, 114, 111, 99, 104, 100, 98, 103, 103, QC1.w, 101, 99, 104, 121, QC1.w, 99, 104, 118, 123, 123, QC1.w, 96, 114, 115, 125, 112, 106, QC1.w, 123, 117, 124, 125, 102, QC1.w, 105, 105, C8077mf.y, 2, 2, 31, 2, C8077mf.q, C8077mf.G, C8077mf.y, 3, 3, 17, C8077mf.A, C8077mf.y, C8077mf.x, 51, 49, 55, 48, C4715Xk.i, C4715Xk.i, 57, 114, 19, 54, C3307Iz.V, 114, 1, C8077mf.z, C8077mf.C, 114, 54, 55, 62, 59, 36, 55, 32, C3307Iz.c0, 114, 32, 55, C3307Iz.V, 34, C4715Xk.i, 60, C3307Iz.V, 55, 114, C8077mf.A, 32, 32, C4715Xk.i, 32, 114, ED2.a, 55, C3307Iz.V, C3307Iz.V, 51, 53, 55, 0, C3307Iz.Z, C3307Iz.X, 35, 36, C3307Iz.a0, C3307Iz.a0, C3307Iz.e0, 102, 7, 34, 53, 102, C8077mf.y, 2, 13, 102, 52, 35, 55, 51, 35, 53, 50, 102, 32, C3307Iz.a0, 52, 102, C3307Iz.Z, 34, 53, 102, 32, C3307Iz.Z, 47, 42, 35, 34, C8077mf.B, ED2.a, C4715Xk.i, 59, 60, 49, 49, 53, 126, 31, 58, C3307Iz.e0, 126, 13, C8077mf.D, C8077mf.y, 126, C3307Iz.d0, 59, 47, C3307Iz.c0, 59, C3307Iz.e0, 42, 126, 56, 49, C3307Iz.d0, 126, ED2.a, 58, C3307Iz.e0, 126, 42, 55, 51, 59, 58, 126, 49, C3307Iz.c0, 42, C8077mf.p, C3307Iz.a0, C3307Iz.c0, C3307Iz.e0, 42, C3307Iz.Z, C3307Iz.Z, 35, 104, 9, C3307Iz.d0, 59, 104, C8077mf.E, C8077mf.n, 3, 104, 58, C3307Iz.e0, 60, C4715Xk.i, 58, C3307Iz.Y, C3307Iz.e0, C3307Iz.d0, 104, C3307Iz.Y, C3307Iz.Z, 104, C3307Iz.a0, C3307Iz.d0, 104, 56, 36, C3307Iz.a0, C3307Iz.c0, C3307Iz.e0, C3307Iz.X, C3307Iz.e0, C3307Iz.Y, 60, 59, 65, 102, 100, 98, 101, 104, 104, 108, C3307Iz.Z, 70, 114, 99, 110, 98, 105, 100, 98, C3307Iz.Z, 73, 98, 115, 112, 104, 117, 108, C3307Iz.Z, 84, 67, 76, C3307Iz.Z, 99, 104, 98, 116, 105, 32, 115, C3307Iz.Z, 111, 102, 113, 98, C3307Iz.Z, 102, 107, 107, C3307Iz.Z, 117, 98, 118, 114, 110, 117, 98, 99, C3307Iz.Z, 100, 107, 102, 116, 116, 98, 116, C3307Iz.a0, C3307Iz.Z, 87, 107, 98, 102, 116, 98, C3307Iz.c0, C3307Iz.Z, 100, 111, 98, 100, 108, C3307Iz.Z, 75, 104, 96, 68, 102, 115, C3307Iz.Z, 104, 114, 115, 119, 114, 115, C3307Iz.Z, 97, 104, 117, C3307Iz.Z, 115, 102, 96, C3307Iz.Z, 34, 116, C3307Iz.a0, C3307Iz.Z, 84, 98, 98, C3307Iz.Z, 106, 104, 117, 98, C4715Xk.i, C3307Iz.Z, 111, 115, 115, 119, 116, C4715Xk.i, 40, 40, 99, 98, 113, 98, 107, 104, 119, 98, 117, 116, C3307Iz.a0, 97, 102, 100, 98, 101, 104, 104, 108, C3307Iz.a0, 100, 104, 106, 40, 99, 104, 100, 116, 40, 102, 114, 99, 110, 98, 105, 100, 98, 42, 105, 98, 115, 112, 104, 117, 108, 40, 102, 105, 99, 117, 104, 110, 99, 40, C3307Iz.Z, 34, 5, 7, 1, 6, C8077mf.m, C8077mf.m, C8077mf.q, 68, C3307Iz.X, 17, 0, 13, 1, 10, 7, 1, 68, 42, 1, C8077mf.r, 19, C8077mf.m, C8077mf.z, C8077mf.q, 68, 55, 32, 47, 68, 0, C8077mf.m, 1, C8077mf.A, 10, 67, C8077mf.r, 68, C8077mf.A, 17, C8077mf.x, C8077mf.x, C8077mf.m, C8077mf.z, C8077mf.r, 68, C3307Iz.X, 10, 0, C8077mf.z, C8077mf.m, 13, 0, 68, C3307Iz.c0, 55, 68, C8077mf.u, 1, C8077mf.z, C8077mf.A, 13, C8077mf.m, 10, C8077mf.A, 68, 6, 1, 8, C8077mf.m, 19, 68, 80, 74, 86, C8077mf.m, 
        C3307Iz.d0, 36, C3307Iz.V, 40, C3307Iz.a0, 109, 57, 34, 109, C3307Iz.f0, C3307Iz.d0, C3307Iz.f0, C3307Iz.X, 40, 109, 36, 32, C3307Iz.d0, 42, 40, 103, 64, 72, 77, 68, 69, 1, 85, 78, 1, 77, 78, 64, 69, 1, 108, 68, 69, 72, 64, 1, 71, 78, 83, 1, 111, 64, 85, 72, 87, 68, 1, 96, 69, 90, 125, 117, 112, 121, QC1.w, 60, 104, 115, 60, 108, 125, 110, 111, 121, 60, 90, 125, Byte.MAX_VALUE, 121, 126, 115, 115, 119, 60, 93, QC1.w, 111, 60, 79, 88, 87, 60, QC1.w, 121, 112, 117, 106, 121, 110, 101, 60, 110, 121, 111, 108, 115, 114, 111, 121, C8077mf.B, 55, 50, 59, 126, C8077mf.u, 49, ED2.a, 58, 126, 56, C3307Iz.d0, 49, 51, 126, 9, 59, 60, 8, 55, 59, C3307Iz.a0, 126, C3307Iz.a0, ED2.a, C3307Iz.e0, 126, C8077mf.D, 59, 48, 55, 59, 58, 126, 56, 49, C3307Iz.d0, 126, C8077mf.G, ED2.a, C4715Xk.i, 54, 59, 118, 114, 126, QC1.w, 122, 96, 124, 126, 124, 119, 122, 96, 122, 109, 109, 112, 109, C8077mf.D, C8077mf.G, C8077mf.r, 28, 1, 1, C8077mf.z, C8077mf.r, 7, C8077mf.n, C8077mf.u, 3, C8077mf.D, C8077mf.n, C8077mf.r, C8077mf.u, 31, 31, C8077mf.n, C8077mf.z, 1, 1, 28, 1, 112, 119, 122, 118, 107, 107, 124, 122, 109, 102, 106, 109, QC1.w, 109, 124, 102, 124, 107, 107, 118, 107, 48, 55, C3307Iz.e0, 60, C3307Iz.c0, 55, 56, 53, C3307Iz.Y, 60, C3307Iz.c0, C3307Iz.c0, 54, C3307Iz.c0, 5, 2, C8077mf.B, 9, C8077mf.H, 31, C8077mf.B, 5, C8077mf.B, 5, 13, 0, 19, 13, 8, 19, C8077mf.B, 5, 1, 9, 3, C8077mf.C, C8077mf.B, 88, 95, 69, 84, 67, 66, 69, 88, 69, 88, 80, 93, 78, 82, 94, 95, 69, 67, 94, 93, 93, 84, 67, 78, 88, 66, 78, 95, 68, 93, 93, 50, C8077mf.y, 91, C8077mf.x, 9, 31, C8077mf.H, 9, 91, C8077mf.q, C8077mf.x, 91, C8077mf.p, 8, C8077mf.H, 91, C8077mf.B, C8077mf.D, C8077mf.B, 19, C8077mf.H, 91, C8077mf.u, C8077mf.y, 91, C4715Xk.i, C8077mf.D, C8077mf.B, C8077mf.H, C8077mf.C, C8077mf.x, C8077mf.x, C8077mf.r, 91, 58, C8077mf.p, 31, C8077mf.u, C8077mf.H, C8077mf.y, C8077mf.B, C8077mf.H, 91, 53, C8077mf.H, C8077mf.q, C8077mf.n, C8077mf.x, 9, C8077mf.r, 91, 40, ED2.a, 48, 91, 2, C8077mf.x, C8077mf.p, 91, 8, 19, C8077mf.x, C8077mf.p, C8077mf.A, 31, 91, C8077mf.n, 19, C8077mf.u, C8077mf.q, C8077mf.H, C8077mf.A, C8077mf.u, 8, C8077mf.q, 91, 74, 73, 76, 85, 75, 85, 75, 85, 74, 91, C8077mf.u, C8077mf.y, 91, 2, C8077mf.x, C8077mf.p, 9, 91, 53, C8077mf.H, C8077mf.q, C8077mf.n, C8077mf.x, 9, C8077mf.r, 91, 40, C8077mf.H, C8077mf.B, C8077mf.p, 9, C8077mf.u, C8077mf.q, 2, 91, 56, C8077mf.x, C8077mf.y, C8077mf.G, C8077mf.u, 28, C8077mf.p, 9, C8077mf.D, C8077mf.q, C8077mf.u, C8077mf.x, C8077mf.y, 65, 113, 71, 31, C8077mf.x, C8077mf.z, C8077mf.D, C8077mf.u, C8077mf.y, 86, C8077mf.B, C8077mf.x, C8077mf.y, C8077mf.G, C8077mf.u, 28, 91, C8077mf.B, C8077mf.A, C8077mf.H, C8077mf.D, 9, C8077mf.q, C8077mf.H, 3, C8077mf.q, 47, 9, C8077mf.D, C8077mf.G, C8077mf.G, C8077mf.u, C8077mf.B, C3307Iz.c0, C8077mf.H, 9, C8077mf.z, C8077mf.u, C8077mf.q, C8077mf.q, C8077mf.H, 31, 70, 89, C8077mf.q, 9, C8077mf.p, C8077mf.H, 89, 69, 113, 91, 91, 91, 91, 71, 31, C8077mf.x, C8077mf.z, C8077mf.D, C8077mf.u, C8077mf.y, 91, C8077mf.u, C8077mf.y, C8077mf.B, C8077mf.A, C8077mf.p, 31, C8077mf.H, 40, C8077mf.p, C8077mf.C, 31, C8077mf.x, C8077mf.z, C8077mf.D, C8077mf.u, C8077mf.y, 8, 70, 89, C8077mf.q, 9, C8077mf.p, C8077mf.H, 89, 69, 74, 73, 76, 85, 75, 85, 75, 85, 74, 71, 84, 31, C8077mf.x, C8077mf.z, C8077mf.D, C8077mf.u, C8077mf.y, 69, 113, 71, 84, 31, C8077mf.x, C8077mf.z, C8077mf.D, C8077mf.u, C8077mf.y, 86, C8077mf.B, C8077mf.x, C8077mf.y, C8077mf.G, C8077mf.u, 28, 69, 113, 40, C8077mf.H, C8077mf.H, 91, C8077mf.z, C8077mf.x, 9, C8077mf.H, 65, 91, 19, C8077mf.q, C8077mf.q, C8077mf.m, 8, 65, 84, 84, 31, C8077mf.H, 13, C8077mf.H, C8077mf.A, C8077mf.x, C8077mf.m, C8077mf.H, 9, 8, 85, C8077mf.G, C8077mf.D, C8077mf.B, C8077mf.H, C8077mf.C, C8077mf.x, C8077mf.x, C8077mf.r, 85, C8077mf.B, C8077mf.x, C8077mf.z, 84, 31, C8077mf.x, C8077mf.B, 8, 84, C8077mf.D, C8077mf.p, 31, C8077mf.u, C8077mf.H, C8077mf.y, C8077mf.B, C8077mf.H, 86, C8077mf.y, C8077mf.H, C8077mf.q, C8077mf.n, C8077mf.x, 9, C8077mf.r, 84, C8077mf.D, C8077mf.y, 31, 9, C8077mf.x, C8077mf.u, 31, 86, C8077mf.y, C8077mf.H, C8077mf.q, C8077mf.n, C8077mf.x, 9, C8077mf.r, 86, 8, C8077mf.H, C8077mf.B, C8077mf.p, 9, C8077mf.u, C8077mf.q, 2, 86, C8077mf.B, C8077mf.x, C8077mf.y, C8077mf.G, C8077mf.u, 28, C4715Xk.i, C8077mf.D, 0, 17, 6, C8077mf.D, C8077mf.y, C8077mf.B, 84, 49, 6, 6, C8077mf.E, 6, 64, 103, 125, 108, 123, 122, 125, 96, 125, 96, 104, 101, C3307Iz.a0, 74, 102, 103, 125, 123, 102, 101, 101, 108, 123, C3307Iz.a0, 96, 122, C3307Iz.a0, 103, 124, 101, 101, C3307Iz.a0, 122, 97, 102, 126, C3307Iz.a0, 72, 109, 101, 66, 90, 77, 64, 69, 72, C8077mf.n, 78, 69, 72, C8077mf.n, 92, 77, 85, 64, 67, 77, 72, 118, 117, 123, 126, 101, 123, 126, 101, 121, 123, 118, 118, Byte.MAX_VALUE, 126, 101, 119, 117, 104, Byte.MAX_VALUE, 101, 110, 114, 123, 116, 101, 117, 116, 121, Byte.MAX_VALUE, 97, 98, 108, 105, 114, 110, 108, 97, 97, 104, 105, 114, 122, 101, 100, 97, 104, 114, 126, 101, 98, 122, 100, 99, 106, 114, 108, 105, 67, 64, 78, 75, 80, 91, 64, 64, 80, 73, 93, 74, 94, 90, 74, 65, 91, 67, 86, C3307Iz.Y, 5, C8077mf.m, C8077mf.p, C3307Iz.c0, C8077mf.p, 74, 9, C8077mf.m, 4, 4, 5, C8077mf.H, 74, 8, C8077mf.q, 74, 9, C8077mf.m, 6, 6, C8077mf.q, C8077mf.p, 74, 7, 5, C8077mf.B, C8077mf.q, 74, C8077mf.H, 2, C8077mf.m, 4, 74, 5, 4, 9, C8077mf.q, Byte.MAX_VALUE, 119, 118, 123, 115, 102, 123, 125, 124, 109, 119, 96, 96, 125, 96, C3307Iz.X, C3307Iz.V, 59, 59, C3307Iz.V, C3307Iz.Y, 47, 55, C3307Iz.d0, C3307Iz.e0, 56, C3307Iz.e0, C3307Iz.Y, C3307Iz.d0, C3307Iz.e0, C3307Iz.Y, C3307Iz.c0, C3307Iz.V, C3307Iz.e0, 59, 55, C3307Iz.e0, 58, 58, C3307Iz.Z, 58, 83, 123, 122, 119, Byte.MAX_VALUE, 72, 119, 123, 105, 62, QC1.w, 113, 108, 62, 119, 125, 113, 112, 62, 119, 109, 62, 115, 119, 109, 109, 119, 112, 121, 62, 119, 112, 62, 80, Byte.MAX_VALUE, 106, 119, 104, 123, 92, Byte.MAX_VALUE, 112, 112, 123, 108, 95, 122, 68, 108, 109, 96, 104, 95, 96, 108, 126, C3307Iz.a0, 96, 122, C3307Iz.a0, 100, 96, 122, 122, 96, 103, 110, C3307Iz.a0, 96, 103, C3307Iz.a0, 71, 104, 125, 96, Byte.MAX_VALUE, 108, 72, 109, 8, 32, C3307Iz.V, C3307Iz.d0, 36, 49, C3307Iz.d0, 42, C3307Iz.c0, 101, 0, 55, 55, 42, 55, 72, 71, 82, 79, 80, 67, 89, 71, 66, 89, 79, 85, 89, 72, 73, 82, 89, 74, 73, 71, 66, 67, 66, 126, 117, 100, 103, Byte.MAX_VALUE, 98, 123, 111, 117, 98, 98, Byte.MAX_VALUE, 98, 97, 96, 112, 110, 107, 110, Byte.MAX_VALUE, 123, 106, 125, 112, 96, 97, 112, 99, 96, 110, 107, C3307Iz.a0, 40, 56, C3307Iz.Y, 35, 
        C3307Iz.Y, 55, 51, 34, 53, 56, 40, C3307Iz.a0, 56, 52, 51, C3307Iz.Y, 53, 51, 113, 112, 96, 126, 123, 96, 111, 115, 126, 124, 122, 114, 122, 113, 107, 52, 53, C3307Iz.X, 60, 51, 54, 54, 115, 114, 98, 112, QC1.w, 121, 116, 124, 107, 116, QC1.w, 106, 98, 116, 115, 98, 115, 124, 105, 116, 107, QC1.w, 124, 121, 48, 49, C3307Iz.V, 51, 59, 58, 55, ED2.a, 40, 55, 59, C3307Iz.a0, C3307Iz.V, 55, 48, C3307Iz.V, 48, ED2.a, 42, 55, 40, 59, 60, ED2.a, 48, 48, 59, C3307Iz.d0, ED2.a, 58, C3307Iz.Z, C8077mf.n, C8077mf.G, C8077mf.H, 6, C8077mf.E, 2, 73, C3307Iz.d0, C8077mf.E, C8077mf.E, 6, C8077mf.E, 66, 99, C3307Iz.d0, 74, 101, 96, 96, 7, C8077mf.z, 5, 4, C8077mf.u, 5, 8, 17, C8077mf.z, C8077mf.H, C8077mf.E, 2, 5, C8077mf.u, 109, 79, 88, C8077mf.G, 126, 92, 94, 85, 84, 83, 90, C8077mf.G, 91, 92, 84, 81, 72, 79, 88, 74, 93, 85, 87, 76, 93, 71, 89, 92, 75, 71, 75, 93, 74, 78, 81, 91, 93, 71, 93, 74, 74, 87, 74, 105, 109, 100, 122, Byte.MAX_VALUE, 100, 111, 114, 118, 126, 116, 110, 111, 124, 106, 125, 121, 106, 125, 112, 106, 125, 125, 96, 125, C3307Iz.X, 34, 55, 36, 34, C3307Iz.a0, 52, 51, 48, 57, 36, 51, C3307Iz.a0, ED2.a, 56, ED2.a, 34, 106, 92, 75, 79, 92, 75, C8077mf.C, 124, 75, 75, 86, 75, 103, 90, 94, 86, 92, 70, 71, 19, 95, 92, 82, 87, 90, 93, 84, 19, 122, 93, 71, 86, 65, 64, 71, 90, 71, 90, 82, 95, 19, 114, 87, 107, 86, 82, 90, 80, 74, 75, 31, 83, 80, 94, 91, 86, 81, 88, 31, 109, 90, 72, 94, 77, 91, 90, 91, 31, 105, 86, 91, 90, 80, 31, 126, 91, 62, C3307Iz.X, 32, C3307Iz.X, 36, 60, C3307Iz.X, 52, C3307Iz.f0, 57, 57, 36, 57, C4715Xk.i, C3307Iz.Y, 35, C3307Iz.Y, C3307Iz.Z, ED2.a, C3307Iz.Y, 55, 58, C3307Iz.e0, 59, 56, C3307Iz.Z, C3307Iz.Y, 59, C3307Iz.e0, 4, 31, 2, 4, 1, 1, C8077mf.H, 3, 5, C8077mf.x, C8077mf.y, C8077mf.p, C8077mf.r, C8077mf.y, C8077mf.p, C8077mf.r, 2, 2, C8077mf.x, 5, C8077mf.p, 31, C8077mf.r, 5, C8077mf.B, 7, C8077mf.x, C8077mf.r, C8077mf.y, C8077mf.p, 53, 48, 53, 52, C3307Iz.d0, 53, 123, C8077mf.G, 58, 56, 62, 57, 52, 52, 48, 123, C8077mf.D, ED2.a, 40, 123, 8, 31, C8077mf.r, 123, ED2.a, 62, 55, 50, C3307Iz.e0, 62, C3307Iz.a0, 34, 123, C3307Iz.a0, 62, 40, C3307Iz.c0, 52, 53, 40, 62, 123, 47, 34, C3307Iz.c0, 62, C8077mf.G, C8077mf.q, 8, C8077mf.y, 28, 3, C8077mf.q, C8077mf.G, C8077mf.y, 9, C8077mf.m, 9, 2, C8077mf.q, C8077mf.y, C8077mf.n, 3, 6, C8077mf.q, C8077mf.y, C8077mf.G, C8077mf.m, C8077mf.C, C8077mf.y, C8077mf.p, C8077mf.q, 4, 3, C8077mf.q, C8077mf.p, C3307Iz.Y, 52, 51, C3307Iz.f0, C3307Iz.Z, 56, 52, C3307Iz.Y, C3307Iz.f0, 55, 48, 56, C4715Xk.i, 52, 53, C3307Iz.f0, C3307Iz.X, 62, C3307Iz.f0, C4715Xk.i, 62, 48, 53, 58, 8, C8077mf.q, 59, 4, 8, C8077mf.D, 77, C8077mf.m, C8077mf.n, 4, 1, 8, 9, 77, C8077mf.C, 2, 77, 1, 2, C8077mf.n, 9, 28, 42, 48, 101, C3307Iz.Y, 36, C3307Iz.c0, 98, 49, 101, C3307Iz.Y, 36, C3307Iz.a0, C3307Iz.a0, 101, 96, 54, 101, 35, 42, 55, 101, 36, C3307Iz.V, 101, 96, 54, 113, 71, 93, 8, 75, 73, 70, C8077mf.q, 92, 8, 75, 73, 68, 68, 8, 13, 91, 8, 78, 71, 90, 8, 73, 76, 8, 65, 70, 8, 91, 92, 73, 92, 77, 8, 13, 91, 113, 118, 113, 108, 89, 124, 56, 117, 109, 107, 108, 56, 122, 125, 56, 123, 121, 116, 116, 125, 124, 56, 122, 125, 126, 119, 106, 125, 56, 107, 108, 121, 106, 108, 89, 124, 73, 82, 87, 82, 83, 75, 82, 28, 89, 78, 78, 83, 78, C8077mf.q, C8077mf.x, 9, C8077mf.q, 10, 10, C8077mf.y, 8, C8077mf.p, 31, C8077mf.H, 90, C8077mf.p, 3, 10, 31, 90, C8077mf.y, 28, 90, C8077mf.E, C8077mf.H, 90, C8077mf.E, 9, 9, 31, C8077mf.p, 9};
    }

    static {
        A01();
    }

    AdErrorType(int i, String str, boolean z) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = z;
    }

    public static AdErrorType adErrorTypeFromCode(int i) {
        return adErrorTypeFromCode(i, UNKNOWN_ERROR);
    }

    public static AdErrorType adErrorTypeFromCode(int i, AdErrorType adErrorType) {
        AdErrorType[] values;
        for (AdErrorType adErrorType2 : values()) {
            if (adErrorType2.getErrorCode() == i) {
                return adErrorType2;
            }
        }
        return adErrorType;
    }

    public String getDefaultErrorMessage() {
        return this.A01;
    }

    public int getErrorCode() {
        return this.A00;
    }

    public boolean isPublicError() {
        return this.A02;
    }
}
