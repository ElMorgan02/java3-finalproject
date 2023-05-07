package com.morgan.weaponry;

public class Weapon implements Cloneable{
    /* All variables (65 total)
    Name,Hash,Id,Tag,Tier,Type,Source,Category,Element,Power,Power Limit,Masterwork Type,Masterwork Tier,Owner,Locked,
    Equipped,Year,Season,Event,Recoil,AA,Impact,Range,Zoom,Blast Radius,Velocity,Stability,ROF,Reload,Mag,Equip,
    Charge Time,Draw Time,Accuracy,Charge Rate,Guard Resistance,Guard Efficiency,Guard Endurance,Swing Speed,
    Shield Duration,Airborne Effectiveness,Crafted,Crafted Level,Kill Tracker,Foundry,Notes,
    Perks 0,Perks 1,Perks 2,Perks 3,Perks 4,Perks 5,Perks 6,Perks 7,Perks 8,Perks 9,Perks 10,Perks 11,Perks 12,Perks 13,
    Perks 14,Perks 15,Perks 16,Perks 17*/

    /*Name*/
    private String name;

    /*Hash*/
    private int Hash;

    /*Id*/
    private long Id;

    /*Tag*/
    String Tag = null;

    /*Tier*/
    private String Tier;

    /*Type*/
    private String Type;

    /*Source*/
    String Source = null;

    /*Category*/
    private String Category;

    /*Element*/
    private String Element;

    /*Power*/
    private int Power;

    /*Power Limit*/
    Integer Power_Limit = null;

    /*Masterwork Type*/
    private String Masterwork_Type;

    /*Masterwork Tier*/
    private int Masterwork_Tier;

    /*Owner*/
    private String Owner;

    /*Locked*/
    private boolean Locked;

    /*Equipped*/
    private boolean Equipped;

    /*Year*/
    private int year;

    /*Season*/
    private int Season;

    /*Event*/
    String Event = null;

    /*Recoil*/
    private int Recoil;

    /*AA*/
    private int AA;

    /*Impact*/
    private int Impact;

    /*Range*/
    private int Range;

    /*Zoom*/
    private int Zoom;

    /*Blast Radius*/
    private int Blast_Radius;

    /*Velocity*/
    private int Velocity;

    /*Stability*/
    private int Stability;

    /*ROF*/
    private int ROF;

    /*Reload*/
    private int Reload;

    /*Mag*/
    private int Mag;

    /*Equip*/
    private int Equip;

    /*Charge Time*/
    private int Charge_Time;

    /*Draw Time*/
    private int Draw_Time;

    /*Accuracy*/
    private int Accuracy;

    /*Charge Rate*/
    private int Charge_Rate;

    /*Guard Resistance*/
    private int Guard_Resistance;

    /*Guard Efficiency*/
    private int Guard_Efficiency;

    /*Guard Endurance*/
    private int Guard_Endurance;

    /*Swing Speed*/
    private int Swing_Speed;

    /*Shield Duration*/
    private int Shield_Duration;

    /*Airborne Effectiveness*/
    private int Airborne_Effectiveness;

    /*Crafted*/
    private boolean Crafted;

    /*Crafted Level*/
    private int Crafted_level;

    /*Kill Tracker*/
    private int Kill_Tracker;

    /*Foundry*/
    private String Foundry;

    /*Notes*/
    String Notes = null;

    /*Perks 0*/
    private String Perks_0;

    /*Perks 1*/
    private String Perks_1;

    /*Perks 2*/
    private String Perks_2;

    /*Perks 3*/
    private String Perks_3;

    /*Perks 4*/
    private String Perks_4;

    /*Perks 5*/
    private String Perks_5;

    /*Perks 6*/
    private String Perks_6;

    /*Perks 7*/
    private String Perks_7;

    /*Perks 8*/
    private String Perks_8;

    /*Perks 9*/
    private String Perks_9;

    /*Perks 10*/
    private String Perks_10;

    /*Perks 11*/
    private String Perks_11;

    /*Perks 12*/
    private String Perks_12;

    /*Perks 13*/
    private String Perks_13;

    /*Perks 14*/
    private String Perks_14;

    /*Perks 15*/
    private String Perks_15;

    /*Perks 16*/
    private String Perks_16;

    /*Perks 17*/
    private String Perks_17;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHash() {
        return Hash;
    }

    public void setHash(int hash) {
        Hash = hash;
    }

    public long getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public String getTier() {
        return Tier;
    }

    public void setTier(String tier) {
        Tier = tier;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getElement() {
        return Element;
    }

    public void setElement(String element) {
        Element = element;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }

    public int getPower_Limits() {
        return Power_Limit;
    }

    public void setPower_Limits(int power_Limits) {
        Power_Limit = power_Limits;
    }

    public String getMasterwork_Type() {
        return Masterwork_Type;
    }

    public void setMasterwork_Type(String masterwork_Type) {
        Masterwork_Type = masterwork_Type;
    }

    public int getMasterwork_Tier() {
        return Masterwork_Tier;
    }

    public void setMasterwork_Tier(int masterwork_Tier) {
        Masterwork_Tier = masterwork_Tier;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public boolean getLocked() {
        return Locked;
    }

    public void setLocked(boolean locked) {
        Locked = locked;
    }

    public boolean getEquipped() {
        return Equipped;
    }

    public void setEquipped(boolean equipped) {
        Equipped = equipped;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeason() {
        return Season;
    }

    public void setSeason(int season) {
        Season = season;
    }

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }

    public int getRecoil() {
        return Recoil;
    }

    public void setRecoil(int recoil) {
        Recoil = recoil;
    }

    public int getAA() {
        return AA;
    }

    public void setAA(int AA) {
        this.AA = AA;
    }

    public int getImpact() {
        return Impact;
    }

    public void setImpact(int impact) {
        Impact = impact;
    }

    public int getRange() {
        return Range;
    }

    public void setRange(int range) {
        Range = range;
    }

    public int getZoom() {
        return Zoom;
    }

    public void setZoom(int zoom) {
        Zoom = zoom;
    }

    public int getBlast_Radius() {
        return Blast_Radius;
    }

    public void setBlast_Radius(int blast_Radius) {
        Blast_Radius = blast_Radius;
    }

    public int getVelocity() {
        return Velocity;
    }

    public void setVelocity(int velocity) {
        Velocity = velocity;
    }

    public int getStability() {
        return Stability;
    }

    public void setStability(int stability) {
        Stability = stability;
    }

    public int getROF() {
        return ROF;
    }

    public void setROF(int ROF) {
        this.ROF = ROF;
    }

    public int getReload() {
        return Reload;
    }

    public void setReload(int reload) {
        Reload = reload;
    }

    public int getMag() {
        return Mag;
    }

    public void setMag(int mag) {
        Mag = mag;
    }

    public int getEquip() {
        return Equip;
    }

    public void setEquip(int equip) {
        Equip = equip;
    }

    public int getCharge_Time() {
        return Charge_Time;
    }

    public void setCharge_Time(int charge_Time) {
        Charge_Time = charge_Time;
    }

    public int getDraw_Time() {
        return Draw_Time;
    }

    public void setDraw_Time(int draw_Time) {
        Draw_Time = draw_Time;
    }

    public int getAccuracy() {
        return Accuracy;
    }

    public void setAccuracy(int accuracy) {
        Accuracy = accuracy;
    }

    public int getCharge_Rate() {
        return Charge_Rate;
    }

    public void setCharge_Rate(int charge_Rate) {
        Charge_Rate = charge_Rate;
    }

    public int getGuard_Resistance() {
        return Guard_Resistance;
    }

    public void setGuard_Resistance(int guard_Resistance) {
        Guard_Resistance = guard_Resistance;
    }

    public int getGuard_Efficiency() {
        return Guard_Efficiency;
    }

    public void setGuard_Efficiency(int guard_Efficiency) {
        Guard_Efficiency = guard_Efficiency;
    }

    public int getGuard_Endurance() {
        return Guard_Endurance;
    }

    public void setGuard_Endurance(int guard_Endurance) {
        Guard_Endurance = guard_Endurance;
    }

    public int getSwing_Speed() {
        return Swing_Speed;
    }

    public void setSwing_Speed(int swing_Speed) {
        Swing_Speed = swing_Speed;
    }

    public int getShield_Duration() {
        return Shield_Duration;
    }

    public void setShield_Duration(int shield_Duration) {
        Shield_Duration = shield_Duration;
    }

    public int getAirborne_Effectiveness() {
        return Airborne_Effectiveness;
    }

    public void setAirborne_Effectiveness(int airborne_Effectiveness) {
        Airborne_Effectiveness = airborne_Effectiveness;
    }

    public boolean getCrafted() {
        return Crafted;
    }

    public void setCrafted(boolean crafted) {
        Crafted = crafted;
    }

    public int getCrafted_level() {
        return Crafted_level;
    }

    public void setCrafted_level(int crafted_level) {
        Crafted_level = crafted_level;
    }

    public int getKill_Tracker() {
        return Kill_Tracker;
    }

    public void setKill_Tracker(int kill_Tracker) {
        Kill_Tracker = kill_Tracker;
    }

    public String getFoundry() {
        return Foundry;
    }

    public void setFoundry(String foundry) {
        Foundry = foundry;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public String getPerks_0() {
        return Perks_0;
    }

    public void setPerks_0(String perks_0) {
        Perks_0 = perks_0;
    }

    public String getPerks_1() {
        return Perks_1;
    }

    public void setPerks_1(String perks_1) {
        Perks_1 = perks_1;
    }

    public String getPerks_2() {
        return Perks_2;
    }

    public void setPerks_2(String perks_2) {
        Perks_2 = perks_2;
    }

    public String getPerks_3() {
        return Perks_3;
    }

    public void setPerks_3(String perks_3) {
        Perks_3 = perks_3;
    }

    public String getPerks_4() {
        return Perks_4;
    }

    public void setPerks_4(String perks_4) {
        Perks_4 = perks_4;
    }

    public String getPerks_5() {
        return Perks_5;
    }

    public void setPerks_5(String perks_5) {
        Perks_5 = perks_5;
    }

    public String getPerks_6() {
        return Perks_6;
    }

    public void setPerks_6(String perks_6) {
        Perks_6 = perks_6;
    }

    public String getPerks_7() {
        return Perks_7;
    }

    public void setPerks_7(String perks_7) {
        Perks_7 = perks_7;
    }

    public String getPerks_8() {
        return Perks_8;
    }

    public void setPerks_8(String perks_8) {
        Perks_8 = perks_8;
    }

    public String getPerks_9() {
        return Perks_9;
    }

    public void setPerks_9(String perks_9) {
        Perks_9 = perks_9;
    }

    public String getPerks_10() {
        return Perks_10;
    }

    public void setPerks_10(String perks_10) {
        Perks_10 = perks_10;
    }

    public String getPerks_11() {
        return Perks_11;
    }

    public void setPerks_11(String perks_11) {
        Perks_11 = perks_11;
    }

    public String getPerks_12() {
        return Perks_12;
    }

    public void setPerks_12(String perks_12) {
        Perks_12 = perks_12;
    }

    public String getPerks_13() {
        return Perks_13;
    }

    public void setPerks_13(String perks_13) {
        Perks_13 = perks_13;
    }

    public String getPerks_14() {
        return Perks_14;
    }

    public void setPerks_14(String perks_14) {
        Perks_14 = perks_14;
    }

    public String getPerks_15() {
        return Perks_15;
    }

    public void setPerks_15(String perks_15) {
        Perks_15 = perks_15;
    }

    public String getPerks_16() {
        return Perks_16;
    }

    public void setPerks_16(String perks_16) {
        Perks_16 = perks_16;
    }

    public String getPerks_17() {
        return Perks_17;
    }

    public void setPerks_17(String perks_17) {
        Perks_17 = perks_17;
    }

    public Weapon(String name, long Id, String Tier, String Type, String Element, int Power, int  Season, boolean Crafted, int Kill_Tracker) {
        this.name = name;
        this.Id = Id;
        this.Tier = Tier;
        this.Type = Type;
        this.Element = Element;
        this.Power = Power;
        this.Season = Season;
        this.Crafted = Crafted;
        this.Kill_Tracker = Kill_Tracker;
    }

    public Weapon() {

    }

    public Weapon(String name, int hash, long id, String tier, String type, String category, String element, int power,
                  Integer power_limits, String masterwork_type, int masterwork_tier, String owner, boolean locked,
                  boolean equipped, int year, int season, int recoil, int aa, int impact, int range, int zoom,
                  int blast_radius, int velocity, int stability, int rof, int reload, int mag, int equip,
                  int charge_time, int draw_time, int accuracy, int charge_rate, int guard_resistance,
                  int guard_efficiency, int guard_endurance, int swing_speed, int shield_duration,
                  int airborne_effectiveness, boolean crafted, int crafted_level, int kill_tracker, String foundry,
                  String perks_0, String perks_1, String perks_2, String perks_3, String perks_4, String perks_5,
                  String perks_6, String perks_7, String perks_8, String perks_9, String perks_10, String perks_11,
                  String perks_12, String perks_13, String perks_14, String perks_15, String perks_16,
                  String perks_17) {
        this.name = name;
        this.Hash = hash;
        this.Id = id;
        this.Tier = tier;
        this.Type = type;
        this.Category = category;
        this.Element = element;
        this.Power = power;
        this.Power_Limit = power_limits;
        this.Masterwork_Type = masterwork_type;
        this.Masterwork_Tier = masterwork_tier;
        this.Owner = owner;
        this.Locked = locked;
        this.Equipped = equipped;
        this.year = year;
        this.Season = season;
        this.Recoil = recoil;
        this.AA = aa;
        this.Impact = impact;
        this.Range = range;
        this.Zoom = zoom;
        this.Blast_Radius = blast_radius;
        this.Velocity = velocity;
        this.Stability = stability;
        this.ROF = rof;
        this.Reload = reload;
        this.Mag = mag;
        this.Equip = equip;
        this.Charge_Time = charge_time;
        this.Draw_Time = draw_time;
        this.Accuracy = accuracy;
        this.Charge_Rate = charge_rate;
        this.Guard_Resistance = guard_resistance;
        this.Guard_Efficiency = guard_efficiency;
        this.Guard_Endurance = guard_endurance;
        this.Swing_Speed = swing_speed;
        this.Shield_Duration = shield_duration;
        this.Airborne_Effectiveness = airborne_effectiveness;
        this.Crafted = crafted;
        this.Crafted_level = crafted_level;
        this.Kill_Tracker = kill_tracker;
        this.Foundry = foundry;
        this.Perks_0 = perks_0;
        this.Perks_1 = perks_1;
        this.Perks_2 = perks_2;
        this.Perks_3 = perks_3;
        this.Perks_4 = perks_4;
        this.Perks_5 = perks_5;
        this.Perks_6 = perks_6;
        this.Perks_7 = perks_7;
        this.Perks_8 = perks_8;
        this.Perks_9 = perks_9;
        this.Perks_10 = perks_10;
        this.Perks_11 = perks_11;
        this.Perks_12 = perks_12;
        this.Perks_13 = perks_13;
        this.Perks_14 = perks_14;
        this.Perks_15 = perks_15;
        this.Perks_16 = perks_16;
        this.Perks_17 = perks_17;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
