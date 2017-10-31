package edu.mst.grbcp5.rps;

public enum ClientProtocol {

  INVALID_CODE ( -1),

  REQUEST_JOIN_GAME (1),
  REQUEST_TO_WAIT_FOR_OTHER_PLAYER (2),

  REQUEST_TO_SUBMIT_MOVE (11),
  REQUEST_GAME_RESULT (12),

  REQUEST_RESIGN (0);

  private int ident;

  ClientProtocol( int ident ) {
    this.ident = ident;
  }

  public int getIdent() {
    return this.ident;
  }

  public static ClientProtocol getClientProtocol( int ident ) {
    for ( ClientProtocol protocol : ClientProtocol.values() ) {
      if( ident == protocol.getIdent() ) {
        return protocol;
      }
    }

    return ClientProtocol.INVALID_CODE;
  }

}
