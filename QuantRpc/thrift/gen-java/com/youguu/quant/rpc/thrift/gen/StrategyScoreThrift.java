/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.youguu.quant.rpc.thrift.gen;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-04-21")
public class StrategyScoreThrift implements org.apache.thrift.TBase<StrategyScoreThrift, StrategyScoreThrift._Fields>, java.io.Serializable, Cloneable, Comparable<StrategyScoreThrift> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StrategyScoreThrift");

  private static final org.apache.thrift.protocol.TField SUCCESS_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("successNum", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField AVERAGE_PROFIT_FIELD_DESC = new org.apache.thrift.protocol.TField("averageProfit", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("updateTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField STRATEGY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("strategyId", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StrategyScoreThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StrategyScoreThriftTupleSchemeFactory());
  }

  public int successNum; // required
  public double averageProfit; // required
  public long updateTime; // required
  public int strategyId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUCCESS_NUM((short)1, "successNum"),
    AVERAGE_PROFIT((short)2, "averageProfit"),
    UPDATE_TIME((short)3, "updateTime"),
    STRATEGY_ID((short)4, "strategyId");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SUCCESS_NUM
          return SUCCESS_NUM;
        case 2: // AVERAGE_PROFIT
          return AVERAGE_PROFIT;
        case 3: // UPDATE_TIME
          return UPDATE_TIME;
        case 4: // STRATEGY_ID
          return STRATEGY_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SUCCESSNUM_ISSET_ID = 0;
  private static final int __AVERAGEPROFIT_ISSET_ID = 1;
  private static final int __UPDATETIME_ISSET_ID = 2;
  private static final int __STRATEGYID_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUCCESS_NUM, new org.apache.thrift.meta_data.FieldMetaData("successNum", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.AVERAGE_PROFIT, new org.apache.thrift.meta_data.FieldMetaData("averageProfit", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("updateTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STRATEGY_ID, new org.apache.thrift.meta_data.FieldMetaData("strategyId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StrategyScoreThrift.class, metaDataMap);
  }

  public StrategyScoreThrift() {
  }

  public StrategyScoreThrift(
    int successNum,
    double averageProfit,
    long updateTime,
    int strategyId)
  {
    this();
    this.successNum = successNum;
    setSuccessNumIsSet(true);
    this.averageProfit = averageProfit;
    setAverageProfitIsSet(true);
    this.updateTime = updateTime;
    setUpdateTimeIsSet(true);
    this.strategyId = strategyId;
    setStrategyIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StrategyScoreThrift(StrategyScoreThrift other) {
    __isset_bitfield = other.__isset_bitfield;
    this.successNum = other.successNum;
    this.averageProfit = other.averageProfit;
    this.updateTime = other.updateTime;
    this.strategyId = other.strategyId;
  }

  public StrategyScoreThrift deepCopy() {
    return new StrategyScoreThrift(this);
  }

  @Override
  public void clear() {
    setSuccessNumIsSet(false);
    this.successNum = 0;
    setAverageProfitIsSet(false);
    this.averageProfit = 0.0;
    setUpdateTimeIsSet(false);
    this.updateTime = 0;
    setStrategyIdIsSet(false);
    this.strategyId = 0;
  }

  public int getSuccessNum() {
    return this.successNum;
  }

  public StrategyScoreThrift setSuccessNum(int successNum) {
    this.successNum = successNum;
    setSuccessNumIsSet(true);
    return this;
  }

  public void unsetSuccessNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCESSNUM_ISSET_ID);
  }

  /** Returns true if field successNum is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccessNum() {
    return EncodingUtils.testBit(__isset_bitfield, __SUCCESSNUM_ISSET_ID);
  }

  public void setSuccessNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCESSNUM_ISSET_ID, value);
  }

  public double getAverageProfit() {
    return this.averageProfit;
  }

  public StrategyScoreThrift setAverageProfit(double averageProfit) {
    this.averageProfit = averageProfit;
    setAverageProfitIsSet(true);
    return this;
  }

  public void unsetAverageProfit() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AVERAGEPROFIT_ISSET_ID);
  }

  /** Returns true if field averageProfit is set (has been assigned a value) and false otherwise */
  public boolean isSetAverageProfit() {
    return EncodingUtils.testBit(__isset_bitfield, __AVERAGEPROFIT_ISSET_ID);
  }

  public void setAverageProfitIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AVERAGEPROFIT_ISSET_ID, value);
  }

  public long getUpdateTime() {
    return this.updateTime;
  }

  public StrategyScoreThrift setUpdateTime(long updateTime) {
    this.updateTime = updateTime;
    setUpdateTimeIsSet(true);
    return this;
  }

  public void unsetUpdateTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UPDATETIME_ISSET_ID);
  }

  /** Returns true if field updateTime is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdateTime() {
    return EncodingUtils.testBit(__isset_bitfield, __UPDATETIME_ISSET_ID);
  }

  public void setUpdateTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UPDATETIME_ISSET_ID, value);
  }

  public int getStrategyId() {
    return this.strategyId;
  }

  public StrategyScoreThrift setStrategyId(int strategyId) {
    this.strategyId = strategyId;
    setStrategyIdIsSet(true);
    return this;
  }

  public void unsetStrategyId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STRATEGYID_ISSET_ID);
  }

  /** Returns true if field strategyId is set (has been assigned a value) and false otherwise */
  public boolean isSetStrategyId() {
    return EncodingUtils.testBit(__isset_bitfield, __STRATEGYID_ISSET_ID);
  }

  public void setStrategyIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STRATEGYID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SUCCESS_NUM:
      if (value == null) {
        unsetSuccessNum();
      } else {
        setSuccessNum((Integer)value);
      }
      break;

    case AVERAGE_PROFIT:
      if (value == null) {
        unsetAverageProfit();
      } else {
        setAverageProfit((Double)value);
      }
      break;

    case UPDATE_TIME:
      if (value == null) {
        unsetUpdateTime();
      } else {
        setUpdateTime((Long)value);
      }
      break;

    case STRATEGY_ID:
      if (value == null) {
        unsetStrategyId();
      } else {
        setStrategyId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SUCCESS_NUM:
      return getSuccessNum();

    case AVERAGE_PROFIT:
      return getAverageProfit();

    case UPDATE_TIME:
      return getUpdateTime();

    case STRATEGY_ID:
      return getStrategyId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SUCCESS_NUM:
      return isSetSuccessNum();
    case AVERAGE_PROFIT:
      return isSetAverageProfit();
    case UPDATE_TIME:
      return isSetUpdateTime();
    case STRATEGY_ID:
      return isSetStrategyId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StrategyScoreThrift)
      return this.equals((StrategyScoreThrift)that);
    return false;
  }

  public boolean equals(StrategyScoreThrift that) {
    if (that == null)
      return false;

    boolean this_present_successNum = true;
    boolean that_present_successNum = true;
    if (this_present_successNum || that_present_successNum) {
      if (!(this_present_successNum && that_present_successNum))
        return false;
      if (this.successNum != that.successNum)
        return false;
    }

    boolean this_present_averageProfit = true;
    boolean that_present_averageProfit = true;
    if (this_present_averageProfit || that_present_averageProfit) {
      if (!(this_present_averageProfit && that_present_averageProfit))
        return false;
      if (this.averageProfit != that.averageProfit)
        return false;
    }

    boolean this_present_updateTime = true;
    boolean that_present_updateTime = true;
    if (this_present_updateTime || that_present_updateTime) {
      if (!(this_present_updateTime && that_present_updateTime))
        return false;
      if (this.updateTime != that.updateTime)
        return false;
    }

    boolean this_present_strategyId = true;
    boolean that_present_strategyId = true;
    if (this_present_strategyId || that_present_strategyId) {
      if (!(this_present_strategyId && that_present_strategyId))
        return false;
      if (this.strategyId != that.strategyId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_successNum = true;
    list.add(present_successNum);
    if (present_successNum)
      list.add(successNum);

    boolean present_averageProfit = true;
    list.add(present_averageProfit);
    if (present_averageProfit)
      list.add(averageProfit);

    boolean present_updateTime = true;
    list.add(present_updateTime);
    if (present_updateTime)
      list.add(updateTime);

    boolean present_strategyId = true;
    list.add(present_strategyId);
    if (present_strategyId)
      list.add(strategyId);

    return list.hashCode();
  }

  @Override
  public int compareTo(StrategyScoreThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSuccessNum()).compareTo(other.isSetSuccessNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccessNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.successNum, other.successNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAverageProfit()).compareTo(other.isSetAverageProfit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAverageProfit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.averageProfit, other.averageProfit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdateTime()).compareTo(other.isSetUpdateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateTime, other.updateTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStrategyId()).compareTo(other.isSetStrategyId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStrategyId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.strategyId, other.strategyId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("StrategyScoreThrift(");
    boolean first = true;

    sb.append("successNum:");
    sb.append(this.successNum);
    first = false;
    if (!first) sb.append(", ");
    sb.append("averageProfit:");
    sb.append(this.averageProfit);
    first = false;
    if (!first) sb.append(", ");
    sb.append("updateTime:");
    sb.append(this.updateTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("strategyId:");
    sb.append(this.strategyId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StrategyScoreThriftStandardSchemeFactory implements SchemeFactory {
    public StrategyScoreThriftStandardScheme getScheme() {
      return new StrategyScoreThriftStandardScheme();
    }
  }

  private static class StrategyScoreThriftStandardScheme extends StandardScheme<StrategyScoreThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StrategyScoreThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUCCESS_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.successNum = iprot.readI32();
              struct.setSuccessNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AVERAGE_PROFIT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.averageProfit = iprot.readDouble();
              struct.setAverageProfitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UPDATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.updateTime = iprot.readI64();
              struct.setUpdateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STRATEGY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.strategyId = iprot.readI32();
              struct.setStrategyIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, StrategyScoreThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SUCCESS_NUM_FIELD_DESC);
      oprot.writeI32(struct.successNum);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AVERAGE_PROFIT_FIELD_DESC);
      oprot.writeDouble(struct.averageProfit);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UPDATE_TIME_FIELD_DESC);
      oprot.writeI64(struct.updateTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STRATEGY_ID_FIELD_DESC);
      oprot.writeI32(struct.strategyId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StrategyScoreThriftTupleSchemeFactory implements SchemeFactory {
    public StrategyScoreThriftTupleScheme getScheme() {
      return new StrategyScoreThriftTupleScheme();
    }
  }

  private static class StrategyScoreThriftTupleScheme extends TupleScheme<StrategyScoreThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StrategyScoreThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSuccessNum()) {
        optionals.set(0);
      }
      if (struct.isSetAverageProfit()) {
        optionals.set(1);
      }
      if (struct.isSetUpdateTime()) {
        optionals.set(2);
      }
      if (struct.isSetStrategyId()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSuccessNum()) {
        oprot.writeI32(struct.successNum);
      }
      if (struct.isSetAverageProfit()) {
        oprot.writeDouble(struct.averageProfit);
      }
      if (struct.isSetUpdateTime()) {
        oprot.writeI64(struct.updateTime);
      }
      if (struct.isSetStrategyId()) {
        oprot.writeI32(struct.strategyId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StrategyScoreThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.successNum = iprot.readI32();
        struct.setSuccessNumIsSet(true);
      }
      if (incoming.get(1)) {
        struct.averageProfit = iprot.readDouble();
        struct.setAverageProfitIsSet(true);
      }
      if (incoming.get(2)) {
        struct.updateTime = iprot.readI64();
        struct.setUpdateTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.strategyId = iprot.readI32();
        struct.setStrategyIdIsSet(true);
      }
    }
  }

}
