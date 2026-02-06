package o;

/* loaded from: classes3.dex */
public class U11 {
    public static X11 a(int i) {
        switch (i) {
            case 0:
                return new C9679tD();
            case 1:
                return new C7634ku0();
            case 2:
                return new C4979a01();
            case 3:
                try {
                    return new IK1(3);
                } catch (C9009qT0 e) {
                    e.printStackTrace();
                    break;
                }
            case 4:
                try {
                    return new IK1(4);
                } catch (C9009qT0 e2) {
                    e2.printStackTrace();
                    break;
                }
            case 5:
                try {
                    return new IK1(5);
                } catch (C9009qT0 e3) {
                    e3.printStackTrace();
                    break;
                }
            case 6:
                return new C9964uN1();
            case 7:
                return new C7397jv2();
            case 8:
                return new C11183zN2();
            case 9:
                return new QK2();
            case 10:
                return new SC1();
            case 11:
                return new C8181n42();
            default:
                return new C9679tD();
        }
    }

    public static X11 b(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1984395789:
                if (str.equals("FourPulse")) {
                    c = 0;
                    break;
                }
                break;
            case -1566594943:
                if (str.equals("FishSpinner")) {
                    c = 1;
                    break;
                }
                break;
            case -805352437:
                if (str.equals("TwinFishesSpinner")) {
                    c = 2;
                    break;
                }
                break;
            case 2702131:
                if (str.equals("Worm")) {
                    c = 3;
                    break;
                }
                break;
            case 50472805:
                if (str.equals("LineSpinner")) {
                    c = 4;
                    break;
                }
                break;
            case 78717670:
                if (str.equals("Radar")) {
                    c = 5;
                    break;
                }
                break;
            case 299449070:
                if (str.equals("Whirlpool")) {
                    c = 6;
                    break;
                }
                break;
            case 426399209:
                if (str.equals("Sharingan")) {
                    c = 7;
                    break;
                }
                break;
            case 776041799:
                if (str.equals("ClassicSpinner")) {
                    c = '\b';
                    break;
                }
                break;
            case 905524411:
                if (str.equals("ThreePulse")) {
                    c = '\t';
                    break;
                }
                break;
            case 958968807:
                if (str.equals("FivePulse")) {
                    c = '\n';
                    break;
                }
                break;
            case 975043943:
                if (str.equals("PhoneWave")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                try {
                    return new IK1(4);
                } catch (C9009qT0 e) {
                    e.printStackTrace();
                    break;
                }
            case 1:
                return new C7634ku0();
            case 2:
                return new C7397jv2();
            case 3:
                return new C11183zN2();
            case 4:
                return new C4979a01();
            case 5:
                return new C9964uN1();
            case 6:
                return new QK2();
            case 7:
                return new C8181n42();
            case '\b':
                return new C9679tD();
            case '\t':
                try {
                    return new IK1(3);
                } catch (C9009qT0 e2) {
                    e2.printStackTrace();
                    break;
                }
            case '\n':
                try {
                    return new IK1(5);
                } catch (C9009qT0 e3) {
                    e3.printStackTrace();
                    break;
                }
            case 11:
                return new SC1();
            default:
                return new C9679tD();
        }
    }
}
