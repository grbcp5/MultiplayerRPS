package edu.mst.grbcp5.rps;

public enum ServerProtocol {

  INVALID_CODE( -1 ),

  JOIN_REQUEST_DENIED (1),
  WAITING_ON_OTHER_PLAYER (2),
  READY_TO_PLAY_GAME (3),

  MOVE_ACCEPTED (10),
  GAME_WON (11),
  GAME_LOST (12),

  SERVER_MUST_RESIGN(0);

  private int ident;

  ServerProtocol( int ident ) {
    this.ident = ident;
  }

  public int getIdent() {
    return this.ident;
  }

  public static ServerProtocol getServerProtocol( int ident ) {
    for ( ServerProtocol protocol : ServerProtocol.values() ) {
      if( ident == protocol.getIdent() ) {
        return protocol;
      }
    }

    return ServerProtocol.INVALID_CODE;
  }

}
