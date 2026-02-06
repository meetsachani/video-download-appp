package o;

/* renamed from: o.mw2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8148mw2 {
    public static final String a = "CUSTOM";
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 8;
    public static final int f = 100;
    public static final int g = 101;

    /* renamed from: o.mw2$a */
    /* loaded from: classes.dex */
    public interface a {
        public static final String A = "rotationX";
        public static final String B = "rotationY";
        public static final String C = "rotationZ";
        public static final String D = "scaleX";
        public static final String E = "scaleY";
        public static final String F = "pivotX";
        public static final String G = "pivotY";
        public static final String H = "progress";
        public static final String I = "pathRotate";
        public static final String J = "easing";
        public static final String K = "CUSTOM";
        public static final String M = "target";
        public static final String a = "KeyAttributes";
        public static final int b = 301;
        public static final int c = 302;
        public static final int d = 303;
        public static final int e = 304;
        public static final int f = 305;
        public static final int g = 306;
        public static final int h = 307;
        public static final int i = 308;
        public static final int j = 309;
        public static final int k = 310;
        public static final int l = 311;
        public static final int m = 312;
        public static final int n = 313;

        /* renamed from: o  reason: collision with root package name */
        public static final int f811o = 314;
        public static final int p = 315;
        public static final int q = 316;
        public static final int r = 317;
        public static final int s = 318;
        public static final String t = "curveFit";
        public static final String u = "visibility";
        public static final String v = "alpha";
        public static final String w = "translationX";
        public static final String x = "translationY";
        public static final String y = "translationZ";
        public static final String z = "elevation";
        public static final String L = "frame";
        public static final String N = "pivotTarget";
        public static final String[] O = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "CUSTOM", L, "target", N};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c2;
            str.getClass();
            switch (str.hashCode()) {
                case -1310311125:
                    if (str.equals("easing")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -880905839:
                    if (str.equals("target")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c2 = C8206nB.d;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 97692013:
                    if (str.equals(L)) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 579057826:
                    if (str.equals("curveFit")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1167159411:
                    if (str.equals(N)) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1941332754:
                    if (str.equals("visibility")) {
                        c2 = 19;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    return r;
                case 1:
                    return 308;
                case 2:
                    return 309;
                case 3:
                    return 310;
                case 4:
                    return 304;
                case 5:
                    return 305;
                case 6:
                    return 306;
                case 7:
                    return 315;
                case '\b':
                    return 313;
                case '\t':
                    return 314;
                case '\n':
                    return 311;
                case 11:
                    return 312;
                case '\f':
                    return 101;
                case '\r':
                    return 307;
                case 14:
                    return 303;
                case 15:
                    return 100;
                case 16:
                    return 301;
                case 17:
                    return q;
                case 18:
                    return s;
                case 19:
                    return 302;
                default:
                    return -1;
            }
        }

        static int getType(int i2) {
            if (i2 != 100) {
                if (i2 == 101) {
                    return 8;
                }
                switch (i2) {
                    case 301:
                    case 302:
                        return 2;
                    case 303:
                    case 304:
                    case 305:
                    case 306:
                    case 307:
                    case 308:
                    case 309:
                    case 310:
                    case 311:
                    case 312:
                    case 313:
                    case 314:
                    case 315:
                    case q /* 316 */:
                        return 4;
                    case r /* 317 */:
                    case s /* 318 */:
                        return 8;
                    default:
                        return -1;
                }
            }
            return 2;
        }
    }

    /* renamed from: o.mw2$b */
    /* loaded from: classes.dex */
    public interface b {
        public static final String a = "Custom";
        public static final String b = "integer";
        public static final String c = "float";
        public static final String d = "color";
        public static final String e = "string";
        public static final String g = "dimension";
        public static final int j = 900;
        public static final int k = 901;
        public static final int l = 902;
        public static final int m = 903;
        public static final int n = 904;

        /* renamed from: o  reason: collision with root package name */
        public static final int f812o = 905;
        public static final int p = 906;
        public static final String f = "boolean";
        public static final String h = "reference";
        public static final String[] i = {"float", "color", "string", f, "dimension", h};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c2;
            str.getClass();
            switch (str.hashCode()) {
                case -1095013018:
                    if (str.equals("dimension")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -925155509:
                    if (str.equals(h)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -891985903:
                    if (str.equals("string")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 64711720:
                    if (str.equals(f)) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 97526364:
                    if (str.equals("float")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1958052158:
                    if (str.equals(b)) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    return f812o;
                case 1:
                    return p;
                case 2:
                    return m;
                case 3:
                    return n;
                case 4:
                    return 902;
                case 5:
                    return 901;
                case 6:
                    return 900;
                default:
                    return -1;
            }
        }
    }

    /* renamed from: o.mw2$c */
    /* loaded from: classes.dex */
    public interface c {
        public static final String A = "translationX";
        public static final String B = "translationY";
        public static final String C = "translationZ";
        public static final String D = "elevation";
        public static final String E = "rotationX";
        public static final String F = "rotationY";
        public static final String G = "rotationZ";
        public static final String H = "scaleX";
        public static final String I = "scaleY";
        public static final String J = "pivotX";
        public static final String K = "pivotY";
        public static final String L = "progress";
        public static final String M = "pathRotate";
        public static final String N = "easing";
        public static final String O = "waveShape";
        public static final String P = "customWave";
        public static final String Q = "period";
        public static final String R = "offset";
        public static final String S = "phase";
        public static final String[] T = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "waveShape", P, Q, R, S};
        public static final String a = "KeyCycle";
        public static final int b = 401;
        public static final int c = 402;
        public static final int d = 403;
        public static final int e = 304;
        public static final int f = 305;
        public static final int g = 306;
        public static final int h = 307;
        public static final int i = 308;
        public static final int j = 309;
        public static final int k = 310;
        public static final int l = 311;
        public static final int m = 312;
        public static final int n = 313;

        /* renamed from: o  reason: collision with root package name */
        public static final int f813o = 314;
        public static final int p = 315;
        public static final int q = 416;
        public static final int r = 420;
        public static final int s = 421;
        public static final int t = 422;
        public static final int u = 423;
        public static final int v = 424;
        public static final int w = 425;
        public static final String x = "curveFit";
        public static final String y = "visibility";
        public static final String z = "alpha";

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c2;
            str.getClass();
            switch (str.hashCode()) {
                case -1310311125:
                    if (str.equals("easing")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 579057826:
                    if (str.equals("curveFit")) {
                        c2 = C8206nB.d;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1941332754:
                    if (str.equals("visibility")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    return r;
                case 1:
                    return 308;
                case 2:
                    return 309;
                case 3:
                    return 310;
                case 4:
                    return 304;
                case 5:
                    return 305;
                case 6:
                    return 306;
                case 7:
                    return 315;
                case '\b':
                    return 313;
                case '\t':
                    return 314;
                case '\n':
                    return 311;
                case 11:
                    return 312;
                case '\f':
                    return 403;
                case '\r':
                    return 401;
                case 14:
                    return 416;
                case 15:
                    return 402;
                default:
                    return -1;
            }
        }

        static int getType(int i2) {
            if (i2 != 100) {
                if (i2 != 101) {
                    if (i2 != 416) {
                        if (i2 != 420 && i2 != 421) {
                            switch (i2) {
                                case 304:
                                case 305:
                                case 306:
                                case 307:
                                case 308:
                                case 309:
                                case 310:
                                case 311:
                                case 312:
                                case 313:
                                case 314:
                                case 315:
                                    return 4;
                                default:
                                    switch (i2) {
                                        case 401:
                                        case 402:
                                            return 2;
                                        case 403:
                                            return 4;
                                        default:
                                            switch (i2) {
                                                case u /* 423 */:
                                                case v /* 424 */:
                                                case w /* 425 */:
                                                    return 4;
                                                default:
                                                    return -1;
                                            }
                                    }
                            }
                        }
                        return 8;
                    }
                    return 4;
                }
                return 8;
            }
            return 2;
        }
    }

    /* renamed from: o.mw2$d */
    /* loaded from: classes.dex */
    public interface d {
        public static final String a = "MotionScene";
        public static final int d = 600;
        public static final int e = 601;
        public static final String b = "defaultDuration";
        public static final String c = "layoutDuringTransition";
        public static final String[] f = {b, c};

        static int a(String str) {
            str.getClass();
            if (!str.equals(b)) {
                if (!str.equals(c)) {
                    return -1;
                }
                return 601;
            }
            return 600;
        }

        static int getType(int i) {
            if (i != 600) {
                if (i != 601) {
                    return -1;
                }
                return 1;
            }
            return 2;
        }
    }

    /* renamed from: o.mw2$e */
    /* loaded from: classes.dex */
    public interface e {
        public static final int A = 611;
        public static final int B = 612;
        public static final String a = "Motion";
        public static final String b = "Stagger";
        public static final String c = "PathRotate";
        public static final String d = "QuantizeMotionPhase";
        public static final String e = "TransitionEasing";
        public static final String f = "QuantizeInterpolator";
        public static final String g = "AnimateRelativeTo";
        public static final String h = "AnimateCircleAngleTo";
        public static final String i = "PathMotionArc";
        public static final String j = "DrawPath";
        public static final String k = "PolarRelativeTo";
        public static final String l = "QuantizeMotionSteps";
        public static final String m = "QuantizeInterpolatorType";
        public static final String n = "QuantizeInterpolatorID";

        /* renamed from: o  reason: collision with root package name */
        public static final String[] f814o = {b, c, d, e, f, g, h, i, j, k, l, m, n};
        public static final int p = 600;
        public static final int q = 601;
        public static final int r = 602;
        public static final int s = 603;
        public static final int t = 604;
        public static final int u = 605;
        public static final int v = 606;
        public static final int w = 607;
        public static final int x = 608;
        public static final int y = 609;
        public static final int z = 610;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c2;
            str.getClass();
            switch (str.hashCode()) {
                case -2033446275:
                    if (str.equals(h)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1532277420:
                    if (str.equals(d)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1529145600:
                    if (str.equals(l)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1498310144:
                    if (str.equals(c)) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1030753096:
                    if (str.equals(f)) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -762370135:
                    if (str.equals(j)) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -232872051:
                    if (str.equals(b)) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1138491429:
                    if (str.equals(k)) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1539234834:
                    if (str.equals(m)) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1583722451:
                    if (str.equals(n)) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1639368448:
                    if (str.equals(e)) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1900899336:
                    if (str.equals(g)) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2109694967:
                    if (str.equals(i)) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    return v;
                case 1:
                    return r;
                case 2:
                    return z;
                case 3:
                    return 601;
                case 4:
                    return t;
                case 5:
                    return x;
                case 6:
                    return 600;
                case 7:
                    return y;
                case '\b':
                    return A;
                case '\t':
                    return B;
                case '\n':
                    return s;
                case 11:
                    return u;
                case '\f':
                    return w;
                default:
                    return -1;
            }
        }
    }

    /* renamed from: o.mw2$f */
    /* loaded from: classes.dex */
    public interface f {
        public static final String a = "dragscale";
        public static final String b = "dragthreshold";
        public static final String c = "maxvelocity";
        public static final String d = "maxacceleration";
        public static final String e = "springmass";
        public static final String f = "springstiffness";
        public static final String g = "springdamping";
        public static final String h = "springstopthreshold";
        public static final String i = "dragdirection";
        public static final String j = "touchanchorid";
        public static final String k = "touchanchorside";
        public static final String l = "rotationcenterid";
        public static final String m = "touchregionid";
        public static final String n = "limitboundsto";

        /* renamed from: o  reason: collision with root package name */
        public static final String f815o = "movewhenscrollattop";
        public static final String p = "ontouchup";
        public static final String r = "springboundary";
        public static final String t = "autocompletemode";
        public static final String v = "nestedscrollflags";
        public static final String[] q = {"autoComplete", "autoCompleteToStart", "autoCompleteToEnd", "stop", C6725h90.i, "decelerateAndComplete", "neverCompleteToStart", "neverCompleteToEnd"};
        public static final String[] s = {C6725h90.n, "bounceStart", "bounceEnd", "bounceBoth"};
        public static final String[] u = {"continuousVelocity", "spring"};
        public static final String[] w = {"none", "disablePostScroll", "disableScroll", "supportScrollUp"};
    }

    /* renamed from: o.mw2$g */
    /* loaded from: classes.dex */
    public interface g {
        public static final String a = "KeyPosition";
        public static final String b = "transitionEasing";
        public static final String c = "drawPath";
        public static final String d = "percentWidth";
        public static final String e = "percentHeight";
        public static final String f = "sizePercent";
        public static final String g = "percentX";
        public static final String h = "percentY";
        public static final int i = 501;
        public static final int j = 502;
        public static final int k = 503;
        public static final int l = 504;
        public static final int m = 505;
        public static final int n = 506;

        /* renamed from: o  reason: collision with root package name */
        public static final int f816o = 507;
        public static final int p = 508;
        public static final int q = 509;
        public static final int r = 510;
        public static final String[] s = {"transitionEasing", "drawPath", "percentWidth", "percentHeight", "sizePercent", "percentX", "percentY"};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c2;
            str.getClass();
            switch (str.hashCode()) {
                case -1812823328:
                    if (str.equals("transitionEasing")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1127236479:
                    if (str.equals("percentWidth")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1017587252:
                    if (str.equals("percentHeight")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -827014263:
                    if (str.equals("drawPath")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -200259324:
                    if (str.equals("sizePercent")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 428090547:
                    if (str.equals("percentX")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 428090548:
                    if (str.equals("percentY")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    return i;
                case 1:
                    return k;
                case 2:
                    return l;
                case 3:
                    return j;
                case 4:
                    return m;
                case 5:
                    return n;
                case 6:
                    return f816o;
                default:
                    return -1;
            }
        }

        static int getType(int i2) {
            if (i2 != 100) {
                if (i2 != 101) {
                    switch (i2) {
                        case i /* 501 */:
                        case j /* 502 */:
                            return 8;
                        case k /* 503 */:
                        case l /* 504 */:
                        case m /* 505 */:
                        case n /* 506 */:
                        case f816o /* 507 */:
                            return 4;
                        case p /* 508 */:
                            return 2;
                        default:
                            return -1;
                    }
                }
                return 8;
            }
            return 2;
        }
    }

    /* renamed from: o.mw2$h */
    /* loaded from: classes.dex */
    public interface h {
        public static final String a = "Transitions";
        public static final String b = "duration";
        public static final String c = "from";
        public static final String d = "to";
        public static final int j = 700;
        public static final int k = 701;
        public static final int l = 702;
        public static final int m = 509;
        public static final int n = 704;

        /* renamed from: o  reason: collision with root package name */
        public static final int f817o = 705;
        public static final int p = 706;
        public static final int q = 707;
        public static final String e = "pathMotionArc";
        public static final String f = "autoTransition";
        public static final String g = "motionInterpolator";
        public static final String h = "staggered";
        public static final String i = "transitionFlags";
        public static final String[] r = {"duration", "from", "to", e, f, g, h, "from", i};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c2;
            str.getClass();
            switch (str.hashCode()) {
                case -1996906958:
                    if (str.equals(i)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1992012396:
                    if (str.equals("duration")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1357874275:
                    if (str.equals(g)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1298065308:
                    if (str.equals(f)) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3707:
                    if (str.equals("to")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3151786:
                    if (str.equals("from")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1310733335:
                    if (str.equals(e)) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1839260940:
                    if (str.equals(h)) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    return q;
                case 1:
                    return 700;
                case 2:
                    return f817o;
                case 3:
                    return n;
                case 4:
                    return l;
                case 5:
                    return k;
                case 6:
                    return 509;
                case 7:
                    return p;
                default:
                    return -1;
            }
        }

        static int getType(int i2) {
            if (i2 != 509) {
                switch (i2) {
                    case 700:
                        return 2;
                    case k /* 701 */:
                    case l /* 702 */:
                        return 8;
                    default:
                        switch (i2) {
                            case f817o /* 705 */:
                            case q /* 707 */:
                                return 8;
                            case p /* 706 */:
                                return 4;
                            default:
                                return -1;
                        }
                }
            }
            return 2;
        }
    }

    /* renamed from: o.mw2$i */
    /* loaded from: classes.dex */
    public interface i {
        public static final String a = "KeyTrigger";
        public static final String b = "viewTransitionOnCross";
        public static final String c = "viewTransitionOnPositiveCross";
        public static final String d = "viewTransitionOnNegativeCross";
        public static final String e = "postLayout";
        public static final String f = "triggerSlack";
        public static final String g = "triggerCollisionView";
        public static final String h = "triggerCollisionId";
        public static final String i = "triggerID";
        public static final String j = "positiveCross";
        public static final String k = "negativeCross";
        public static final String l = "triggerReceiver";
        public static final String m = "CROSS";
        public static final String[] n = {"viewTransitionOnCross", "viewTransitionOnPositiveCross", "viewTransitionOnNegativeCross", "postLayout", "triggerSlack", "triggerCollisionView", "triggerCollisionId", "triggerID", "positiveCross", "negativeCross", "triggerReceiver", "CROSS"};

        /* renamed from: o  reason: collision with root package name */
        public static final int f818o = 301;
        public static final int p = 302;
        public static final int q = 303;
        public static final int r = 304;
        public static final int s = 305;
        public static final int t = 306;
        public static final int u = 307;
        public static final int v = 308;
        public static final int w = 309;
        public static final int x = 310;
        public static final int y = 311;
        public static final int z = 312;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c2;
            str.getClass();
            switch (str.hashCode()) {
                case -1594793529:
                    if (str.equals("positiveCross")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -966421266:
                    if (str.equals("viewTransitionOnPositiveCross")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -786670827:
                    if (str.equals("triggerCollisionId")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -648752941:
                    if (str.equals("triggerID")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -638126837:
                    if (str.equals("negativeCross")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -76025313:
                    if (str.equals("triggerCollisionView")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -9754574:
                    if (str.equals("viewTransitionOnNegativeCross")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 64397344:
                    if (str.equals("CROSS")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 364489912:
                    if (str.equals("triggerSlack")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1301930599:
                    if (str.equals("viewTransitionOnCross")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1401391082:
                    if (str.equals("postLayout")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1535404999:
                    if (str.equals("triggerReceiver")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    return 309;
                case 1:
                    return 302;
                case 2:
                    return 307;
                case 3:
                    return 308;
                case 4:
                    return 310;
                case 5:
                    return 306;
                case 6:
                    return 303;
                case 7:
                    return 312;
                case '\b':
                    return 305;
                case '\t':
                    return 301;
                case '\n':
                    return 304;
                case 11:
                    return 311;
                default:
                    return -1;
            }
        }
    }

    int a(String str);

    boolean b(int i2, int i3);

    boolean c(int i2, float f2);

    boolean d(int i2, boolean z);

    boolean e(int i2, String str);
}
